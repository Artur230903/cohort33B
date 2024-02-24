package cohort33.lessons.lesson20231125_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeOutputStream04 {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOutputStream04.class);

  private static String path = "D:\\IntelliJIDEAcohort33\\Projects"
      + "\\cohort33B\\src\\main\\java\\cohort33\\lessons\\lesson20231125_04"
      + "\\employees04.txt";

  public static void main(String[] args) throws IOException {
    File fileEmployees04 = new File("D:\\IntelliJIDEAcohort33\\Projects"
        + "\\cohort33B\\src\\main\\java\\cohort33\\lessons\\lesson20231125_04"
        + "\\employees04.txt");
    fileEmployees04.createNewFile();

    Employee04 employeeBatman = new Employee04(1876, "Batman", 2000);
    Employee04 employeeRobin = new Employee04(2000, "Robin", 65000);
    List<Employee04> employee04ArrayList = new ArrayList<>();
    employee04ArrayList.add(employeeBatman);
    employee04ArrayList.add(employeeRobin);

    try (FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
      outputStream.writeObject(employee04ArrayList);
      outputStream.flush();

      LOGGER.info("Employee data was successfully saved. id: {}", employeeBatman.getId());
    } catch (FileNotFoundException exception) {
      LOGGER.error("File {} not found or not created {}", path, exception.getMessage());
    } catch (IOException exception) {
      LOGGER.error("Error in data processing. Fail: {}, exception: {}", path,
          exception.getMessage());
    }

  }

}

package cohort33.lessons.lesson20231125_03_SerializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeOutputStream {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOutputStream.class);

  private static String path = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
      + "\\src\\main\\java\\cohort33\\lessons"
      + "\\lesson20231125_03_SerializationDeserialization\\employees.txt";

  public static void main(String[] args) {
    Employee employeeBatman = new Employee(1876, "Batman");
//    Employee employeeRobin = new Employee(1900, "Robin");

    try (FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

      outputStream.writeObject(employeeBatman);
//      outputStream.writeObject(employeeRobin);
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

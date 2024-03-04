package cohort33.lessons.lesson53_231125_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeInputStream04 {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeInputStream04.class);

  private static String path = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
      + "\\src\\main\\java\\cohort33\\lessons\\lesson20231125_04"
      + "\\employees04.txt";

  public static void main(String[] args) {

    try (FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
      List<Employee04> employee04List = (List<Employee04>) objectInputStream.readObject();
      for (Employee04 employee04 : employee04List) {
        if (employee04.getId() == 2000 && employee04.getSalary() >= 50000) {
          LOGGER.info("Object was found. ID: {}, Name: {}, Salary: {}", employee04.getId(),
              employee04.getName(), employee04.getSalary());
        }
        else {
          LOGGER.warn("Object is NOT suitable. ID: {}, Name: {}, Salary: {}", employee04.getId(),
              employee04.getName(), employee04.getSalary());
        }
      }

    } catch (FileNotFoundException exception) {
      LOGGER.error("File {} not found or not created {}", path,
          exception.getMessage());
    } catch (IOException exception) {
      LOGGER.error("Error in data processing. Fail: {}, exception: {}", path,
          exception.getMessage());
    } catch (ClassNotFoundException exception) {
      LOGGER.error("Error in deserialization. Exception: {}", exception.getMessage());
    }

  }


}

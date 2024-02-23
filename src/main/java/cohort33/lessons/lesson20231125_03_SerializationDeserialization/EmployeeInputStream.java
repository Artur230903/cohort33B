package cohort33.lessons.lesson20231125_03_SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeInputStream {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeInputStream.class);

  private static String path = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
      + "\\src\\main\\java\\cohort33\\lessons"
      + "\\lesson20231125_03_SerializationDeserialization\\employees.txt";

  public static void main(String[] args) {

    try (FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

      Employee employee = (Employee) objectInputStream.readObject();

      LOGGER.info("Object was successfully created, ID: {}, Name: {}", employee.getId(), employee.getName());

    } catch (FileNotFoundException exception) {
      throw new RuntimeException(exception);
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    } catch (ClassNotFoundException exception) {
      throw new RuntimeException(exception);
    }

  }


}

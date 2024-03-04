package cohort33.homeworks.homework53;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class takeInfoFromFileAnimal {

  private static final Logger LOGGER = LoggerFactory.getLogger(takeInfoFromFileAnimal.class);


  private static String path = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
      + "\\src\\main\\java\\cohort33\\homeworks\\homework53\\fileAnimal.jct";

  public static void main(String[] args) {
    try(FileInputStream fileInputStreamAnimal53 = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStreamAnimal53)) {
      List<Animal> animalList53 = (List<Animal>) objectInputStream.readObject();
      for (Animal animal : animalList53){
        System.out.println("---");
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

}

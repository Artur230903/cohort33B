package cohort33.examples.IOString;

import cohort33.examples.logirovanie.primerLogirovaniaBankAccount;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalFileWriter {

  private static final Logger LOGGER = LoggerFactory.getLogger(AnimalFileWriter.class);


  public void saveAnimalsToFile(List<Animal> animalsToSave, String filePath){
    try(FileWriter fileWriter = new FileWriter(filePath)) {
      for (Animal animal : animalsToSave){
        fileWriter.write(animal.toString());

      }
    } catch (IOException exception) {
      LOGGER.error("Save data error {}", exception.getMessage());
    }
  }

}

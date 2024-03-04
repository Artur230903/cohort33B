package cohort33.examples.fileSeporator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalFileWriter {

  private static final Logger LOGGER = LoggerFactory.getLogger(AnimalFileWriter.class);

  public void saveAnimalsToFile(List<Animal> animalsToSave, String file){
    try {
      FileWriter fileWriter = new FileWriter(file);
      for (Animal animal : animalsToSave){
        fileWriter.write(animal.toString());
      }
      fileWriter.close();
    } catch (IOException exception) {
      LOGGER.error("Save data error {}", exception.getMessage());
    }
  }

}

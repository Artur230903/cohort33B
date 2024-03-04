package cohort33.homeworks.homework53_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteToFile {

  private static final Logger LOGGER = LoggerFactory.getLogger(WriteToFile.class);

  private static String pathToDir = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B\\src"
      + "\\main\\java\\cohort33\\homeworks\\homework53_02";

  public String pathToFile() {
    String pathToFile = pathToDir + File.separator + "animalfile.jct";
    return pathToFile;
  }

  public void writerToFile(List<Animal> animalListSaveToFile, String file) {
    try {
      FileWriter fileWriter = new FileWriter(file);
      for (Animal animal : animalListSaveToFile) {
        fileWriter.write(animal.toString());
      }
      fileWriter.close();
    } catch (IOException exception) {
      LOGGER.error("Error in data processing. Fail: {}. Exception: {}", pathToFile(),
          exception.getMessage());
    }

  }

}

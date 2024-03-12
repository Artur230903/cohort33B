package cohort33.lessons.lesson54_231129_ENUMS.homework53;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalFileReader {

  private static final Logger LOGGER = LoggerFactory.getLogger(AnimalFileReader.class);

  public void readAnimalsFromFile(String file) {
    try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String animalLine;
      while ((animalLine = bufferedReader.readLine()) != null) {
        System.out.println(animalLine);
      }
    } catch (FileNotFoundException exception) {
      LOGGER.error("File not found {}", exception.getMessage());
    } catch (IOException exception) {
      LOGGER.error("Error reading file {}", exception.getMessage());
    }
  }

}

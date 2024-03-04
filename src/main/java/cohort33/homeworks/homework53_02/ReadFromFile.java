package cohort33.homeworks.homework53_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFromFile {

  private static final Logger LOGGER = LoggerFactory.getLogger(ReadFromFile.class);

  public void readFromFile(String pathToFile) {
    try {
      FileReader fileReader = new FileReader(pathToFile);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String animalLine;
      while ((animalLine = bufferedReader.readLine()) != null) {
        System.out.println(animalLine);
      }
      fileReader.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }


}

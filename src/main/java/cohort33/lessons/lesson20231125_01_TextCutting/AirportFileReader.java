package cohort33.lessons.lesson20231125_01_TextCutting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirportFileReader {

  private static final Logger LOGGER = LoggerFactory.getLogger(AirportFileReader.class);


  private static String path = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
      + "\\src\\main\\java\\cohort33\\lessons\\lesson20231125_01_TextCutting\\airportsWord.txt";

  public static void main(String[] args) {

    try {
      FileReader fileReader = new FileReader(path);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null){
        //разрез строки - на три значения в строке, от пробеле до пробела
        String [] parts = line.split(" ", 3);
        if (parts.length == 3){
          //название
          String name = parts[0];
          //IATA код
          String iata = parts[1];
          //название страны
          String country = parts[2];

          LOGGER.info("Name: {}, IATA code: {}, Country: {}", name, iata, country);

        }
      }
      bufferedReader.close();

    } catch (FileNotFoundException exception) {
      LOGGER.error("Fail {} not found {}", path, exception.getMessage());
    } catch (IOException exception) {
      LOGGER.error("Fail {} imposible to read {}", path, exception.getMessage());
    }
  }
}

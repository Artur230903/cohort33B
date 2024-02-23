package cohort33.homeworks.homework52;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    File fileAirports = new File("D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
        + "\\src\\main\\java\\cohort33\\homeworks\\homework52\\airportsWord.txt");
    fileAirports.createNewFile();

    FileWriter fileWriterAirports = new FileWriter(fileAirports);
    String text = " Paris-Charles-de-Gaulle CDG Frankreich";
    fileWriterAirports.write(text);
    fileWriterAirports.flush();

    FileReader fileReaderAirports = new FileReader(fileAirports);
    BufferedReader bufferedReaderAirports = new BufferedReader(fileReaderAirports);
    String lineInAirports = bufferedReaderAirports.readLine();
    while(lineInAirports != null){
      System.out.println(lineInAirports);
      lineInAirports = bufferedReaderAirports.readLine();
    }

  }

}

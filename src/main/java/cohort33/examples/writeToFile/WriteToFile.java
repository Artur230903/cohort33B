package cohort33.examples.writeToFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

  public static void main(String[] args) throws IOException {
    File fileToWrite = new File("D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
        + "\\src\\main\\java\\cohort33\\examples\\writeToFile\\filetowrite.txt");
    fileToWrite.createNewFile();

    FileWriter fileWriterAirports = new FileWriter(fileToWrite);
    String text = "Hi there!";
    fileWriterAirports.write(text);
    fileWriterAirports.flush();
  }

}

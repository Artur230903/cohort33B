package cohort33.homeworks.homework51;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    File dirMyDir = new File(
        "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B\\src\\main\\java\\cohort33\\MyDir");
    dirMyDir.mkdir();

    File fileSource = new File(dirMyDir + File.separator + "source51.txt");
    fileSource.createNewFile();

    File fileDestination = new File(dirMyDir + File.separator + "destination.txt");
    fileDestination.createNewFile();

    FileReader fileReaderSource = new FileReader(fileSource);

    BufferedReader bufferedReaderSource = new BufferedReader(fileReaderSource);

    String lineReadSource = bufferedReaderSource.readLine();

    while (lineReadSource != null) {
      System.out.println(lineReadSource);
      lineReadSource = bufferedReaderSource.readLine();
    }
    FileWriter fileWriterDestination = new FileWriter("destination.txt");
    fileWriterDestination.write("fff");
  }

}

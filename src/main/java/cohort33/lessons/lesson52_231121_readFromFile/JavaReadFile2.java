package cohort33.lessons.lesson52_231121_readFromFile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaReadFile2 {

  public static void main(String[] args) throws IOException {
    File file = new File("D:\\IntelliJ IDEA Community Edition 2023.1.2\\"
        + "Projects\\cohort33B\\MyDirectory\\Book.txt");

    file.createNewFile();

    Path path = Paths.get(file.getAbsolutePath());

    List<String> linesInDocument = Files.readAllLines(path, StandardCharsets.UTF_8);
    linesInDocument.forEach(System.out::println);
  }

}

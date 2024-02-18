package cohort33.examples.fileCreation;

import java.io.File;
import java.io.IOException;

public class FileCreation {
  public static void main(String[] args) throws IOException {

    int counter = 1;

    System.out.println("-----" + (counter++) + "-----");
    File fileOne = new File("fileOne.txt");
    String pathOne = fileOne.getPath();
    System.out.println(pathOne);
    String pathOneAbsolute = fileOne.getAbsolutePath();
    System.out.println(pathOneAbsolute);
    System.out.println(fileOne.createNewFile());

    System.out.println("-----" + (counter++) + "-----");
    File fileTwo = new File("D:\\IntelliJ IDEA Community Edition 2023.1.2\\Projects\\cohort33B\\files\\fileTwo.txt");
    System.out.println(fileTwo.createNewFile());
    String pathTwoAbsolutePath = fileTwo.getAbsolutePath();
    System.out.println(pathTwoAbsolutePath);

  }

}

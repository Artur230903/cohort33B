package cohort33.lessons.lesson20231120;

import java.io.File;
import java.io.IOException;

public class JavaFiles {

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

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("Name --> " + fileOne.getName());
    System.out.println("Name --> " + fileTwo.getName());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("isAbsolute --> " + fileOne.isAbsolute());//сдесь указан не полный путь к файлу, а значит будет false
    System.out.println("isAbsolute --> " + fileTwo.isAbsolute());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("Can read --> " + fileOne.canRead());
    System.out.println("Can write --> " + fileOne.canWrite());
    System.out.println("Can read --> " + fileTwo.canRead());
    System.out.println("Can write --> " + fileTwo.canWrite());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("exists --> " + fileOne.exists());
    System.out.println("exists --> " + fileTwo.exists());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("is file --> " + fileOne.isFile());
    System.out.println("is file --> " + fileTwo.isFile());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("is hidden --> " + fileOne.isHidden());
    System.out.println("is hidden --> " + fileTwo.isHidden());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("file size --> " + fileOne.length());
    System.out.println("file size --> " + fileTwo.length());

    System.out.println("-----" + (counter++) + "-----");
    System.out.println("delete file --> " + fileOne.delete());

    System.out.println("delete file --> " + fileOne.delete());
    System.out.println("delete file --> " + fileTwo.delete());

  }

}

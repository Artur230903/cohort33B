package cohort33.lessons.lesson50_231116_IO;

import java.io.IOException;

public class TestJavaIO {

  //Путь к интересующему нас файлу
  private static final String PATH = "D:\\IntelliJ IDEA Community Edition 2023.1.2\\Projects\\cohort33B\\src\\main\\java\\cohort33\\lessons\\lesson50_231116_IO\\password.txt";

  //Экземпляр обьекта
  private static JavaReadWritePassFile javaReadWritePassFile;

  public static void main(String[] args) {

    //инициализируем
    javaReadWritePassFile = new JavaReadWritePassFile(PATH);

    try {
      //читаем файл через вызов метода
      javaReadWritePassFile.readFile();

      javaReadWritePassFile.writeFile("Cohort 33");

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }


  }

}

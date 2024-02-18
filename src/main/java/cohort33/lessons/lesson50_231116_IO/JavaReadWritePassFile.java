package cohort33.lessons.lesson50_231116_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaReadWritePassFile {

  //для чтения файла
  private InputStream inputStream;

  //для внесения изменения в файл
  private OutputStream outputStream;

  //путь к интересующему файлу
  private String path;

  public JavaReadWritePassFile(String path) {
    this.path = path;
  }

  //считываем файл
  public void readFile() throws IOException {
    //инициализируем чтение потока
    inputStream = new FileInputStream(path);

    //считываем первый символ
    int data = inputStream.read();

    char content;

    //считываем содержимое файла побайтово
    while (data != -1) {

      //байт-->символ
      content = (char) data;

      //Выводим полученный символ
      System.out.println(content);

      data = inputStream.read();


    }
    //обязательно закрываем поток
    inputStream.close();

  }

  public void writeFile(String stringToWrite) throws IOException {
    //инициализируем поток на запись
    outputStream = new FileOutputStream(path);

    //подгатавливаем внесение записи в файл/поток
    outputStream.write(stringToWrite.getBytes());

    //обязательно закрываем поток
    outputStream.close();

  }
}

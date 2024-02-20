package cohort33.examples.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaReadFile {

  //Пример --> cohort33.lessons.lesson20231121.homework50;

  //throws IO Exception это в случае если файл не существует
  public static void main(String[] args) throws IOException {
    File file = new File("D:\\IntelliJ IDEA Community Edition 2023.1.2\\"
        + "Projects\\cohort33B\\MyDirectory\\Book.txt");
    file.createNewFile();

    //Создаем и инициализируем FileReader для чтения содержимого файла
    FileReader fileReader = new FileReader(file);

    //Создаем и инициализируем BufferReader для считывания строк
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String liniInDocument = bufferedReader.readLine();

    //если документ не пустой то запускаем цикл на построчное считывание
    while(liniInDocument != null){
      System.out.println(liniInDocument);
      //счяитываем строку
      liniInDocument = bufferedReader.readLine();
    }

  }

}

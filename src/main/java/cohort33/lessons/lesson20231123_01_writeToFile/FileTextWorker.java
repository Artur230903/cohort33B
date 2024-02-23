package cohort33.lessons.lesson20231123_01_writeToFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Задание: Реализация Чтения, Обработки и Записи Файлов в Java
//
//    Цель: Написать программу на Java, которая будет читать текст из одного файла, обрабатывать его по заданному правилу, и записывать результат в другой файл.
//
//    Шаги:
//
//    Создание Файлов:
//
//    Создайте два текстовых файла: source.txt и destination.txt.
//    В source.txt добавьте некоторый текст для обработки.
//    Реализация Чтения Файла:
//
//    Используйте классы из пакета java.io (например, FileReader) для чтения текста из файла source.txt.
//    Преобразование Текста:
//
//    Инвертируйте каждое слово в прочитанном тексте. Например, слово "Java" должно превратиться в "avaJ".
//    Запись в Файл:
//
//    Используйте классы для записи в файл (например, FileWriter), чтобы записать обработанный текст в файл destination.txt.
//    Обработка Исключений:
//
//    Обеспечьте корректную обработку исключений, таких как FileNotFoundException и IOException.
//    Тестирование:
//
//    Проверьте, что программа корректно читает текст из source.txt, обрабатывает его согласно заданному правилу и записывает результат в destination.txt.

public class FileTextWorker {

  private static final String SOURCE_FILE = "source.txt";

  private static final String DESTINATION_FILE = "destination.txt";

  private static final Logger LOGGER = LoggerFactory.getLogger(FileTextWorker.class);


  public static void main(String[] args) {
    try (FileReader reader = new FileReader(SOURCE_FILE);
        FileWriter writer = new FileWriter(DESTINATION_FILE)) {

      writeReversedTextToFile(reader, writer);

    } catch (FileNotFoundException exception) {
      LOGGER.error("File not found {}", exception.getMessage());

    } catch (IOException exception) {
      LOGGER.error("File processing error {}", exception.getMessage());

    }

  }

  public static void writeReversedTextToFile(Reader reader, Writer writer) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(reader);
    BufferedWriter bufferedWriter = new BufferedWriter(writer);

    String line;

    while ((line = bufferedReader.readLine()) != null) {
      String[] words = line.split("\\s+"); //"вырезаем" слова от пробела до пробела
      for (int i = 0; i < words.length; i++) {
        String reversedWord = reverseString(words[i]);
        bufferedWriter.write(reversedWord);
        bufferedWriter.write(" ");
      }
      bufferedWriter.newLine();
    }
    bufferedWriter.flush();

  }

  public static String reverseString(String wordToRevers) {
    char[] lettersArray = new char[wordToRevers.length()];
    for (int i = 0, j = wordToRevers.length() - 1; i <= j; i++, j--) {
      lettersArray[i] = wordToRevers.charAt(j);
      lettersArray[j] = wordToRevers.charAt(i);
    }
    String wordToReturn = new String(lettersArray);
    return wordToReturn;
  }

}

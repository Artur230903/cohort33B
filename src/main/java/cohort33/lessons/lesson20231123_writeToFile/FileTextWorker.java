package cohort33.lessons.lesson20231123_writeToFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileTextWorker {

  private static final String SOURCE_FILE = "source.txt";

  private static final String DESTINATION_FILE = "destination.txt";

  public static void main(String[] args) {
    try (FileReader reader = new FileReader(SOURCE_FILE);
        FileWriter writer = new FileWriter(DESTINATION_FILE)) {

    } catch (FileNotFoundException exception) {

    } catch (IOException exception) {

    }

  }

  public void writeReversedTextToFile(Reader reader, Writer writer) {

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

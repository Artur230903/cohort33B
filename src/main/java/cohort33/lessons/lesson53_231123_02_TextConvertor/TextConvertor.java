package cohort33.lessons.lesson53_231123_02_TextConvertor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextConvertor {

  private static final Logger LOGGER = LoggerFactory.getLogger(TextConvertor.class);


  public String convertToLowerCase(Reader input, Writer output) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(input);
    BufferedWriter bufferedWriter = new BufferedWriter(output);

    String line;

    String lowerCaseWord = null;

    while ((line = bufferedReader.readLine()) != null) {
      String[] words = line.split("\\s+"); //"вырезаем" слова от пробела до пробела
      for (int i = 0; i < words.length; i++) {
        lowerCaseWord = Arrays.toString(words).toLowerCase();
        bufferedWriter.write(lowerCaseWord);
        bufferedWriter.write(" ");
      }
      bufferedWriter.newLine();
    }
    bufferedWriter.flush();
    LOGGER.info("Запись успешно завершена");
    return lowerCaseWord;

  }
}

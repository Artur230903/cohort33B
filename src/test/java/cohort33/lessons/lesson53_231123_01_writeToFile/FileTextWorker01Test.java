package cohort33.lessons.lesson53_231123_01_writeToFile;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTextWorker01Test {

  private LogCaptor logCaptor = LogCaptor.forClass(FileTextWorker01.class);

  private FileTextWorker01 fileTextWorker01;

  @BeforeEach
  private void setUp() {
    fileTextWorker01 = new FileTextWorker01();
  }

  @Test
  void testwriteReversedTextToFileSucces() throws IOException {
    logCaptor.setLogLevelToInfo();
    String testToReverse = "Lesson";
    StringReader stringReader = new StringReader(testToReverse);
    StringWriter stringWriter = new StringWriter();
    String expectedInfoMessage = "Запись успешно завершена";
    FileTextWorker01.writeReversedTextToFile(stringReader, stringWriter);
    Assertions.assertTrue(logCaptor.getInfoLogs().contains(expectedInfoMessage));

  }

  @Test
  void testReverseStringSucces() {
    String reverseResult = FileTextWorker01.reverseString("Amazon");
    String reverseResultNumbers = FileTextWorker01.reverseString("654321");
    Assertions.assertEquals("nozamA", reverseResult);
    Assertions.assertEquals("123456", reverseResultNumbers);

  }

  @Test
  void testReverseStringMethodSmallSucces() {
    String reverseResult = FileTextWorker01.reverseStringSmall("Amazon");
    String reverseResultNumbers = FileTextWorker01.reverseStringSmall("654321");
    Assertions.assertEquals("nozamA", reverseResult);
    Assertions.assertEquals("123456", reverseResultNumbers);

  }
}
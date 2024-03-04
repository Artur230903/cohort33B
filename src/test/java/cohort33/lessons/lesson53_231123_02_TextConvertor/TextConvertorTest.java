package cohort33.lessons.lesson53_231123_02_TextConvertor;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextConvertorTest {

  @Test
  void testConvertToLowerCase() throws IOException {
    TextConvertor textConvertor = new TextConvertor();
    StringReader stringReader = new StringReader("HALLO");
    StringWriter stringWriter = new StringWriter();
    String result = textConvertor.convertToLowerCase(stringReader,stringWriter);
    Assertions.assertEquals("hallo", result);
  }
}
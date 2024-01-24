package cohort33.homeworks.homework34;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cohort33.homeworks.homework34.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {

  private StringProcessor stringProcessor;

  @BeforeEach
  public void setUp() {
    stringProcessor = new StringProcessor();
  }

  @DisplayName("====Test for two parametrs====")
  @Test
  public void testTwoStringConcatination() {
    assertEquals("ab", stringProcessor.concatenate("a", "b"));
  }

  @Test
  public void testStringNull() {
    assertEquals("anull", stringProcessor.concatenate("a", null));
  }

  @Test
  public void testEmptyStrings() {
    assertEquals("nullnull", stringProcessor.concatenate(null, null));
  }

  @Test
  public void testStringLength() {
    assertEquals(3, stringProcessor.getLength("abc"));
  }

  @Test
  public void tsetReverseString() {
    assertEquals("cba", stringProcessor.reverse("abc"));
  }

  @Test
  public void testIsPolindrome() {
    assertEquals(true, stringProcessor.isPalindrome("ABBA"));
  }

  @Test
  void testNotPolindrome() {
    Assertions.assertFalse(stringProcessor.isPalindrome("Hallo"));
  }
}

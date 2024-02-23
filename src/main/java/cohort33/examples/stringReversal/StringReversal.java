package cohort33.examples.stringReversal;

import cohort33.examples.logirovanie.primerLogirovaniaBankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringReversal {

  private static final Logger LOGGER = LoggerFactory.getLogger(StringReversal.class);


  //первый метод
  public static String reverseString(String wordToReverse) {
    char[] lettersArray = new char[wordToReverse.length()];
    for (int i = 0, j = wordToReverse.length() - 1; i <= j; i++, j--) {
      lettersArray[i] = wordToReverse.charAt(j);
      lettersArray[j] = wordToReverse.charAt(i);
    }
    String wordToReturn = new String(lettersArray);
    LOGGER.info("Word {} was successfully processed. Result {}", wordToReverse, wordToReturn);
    return wordToReturn;
  }

  //второй метод
  public static String reverseStringSmall(String wordToReverse) {
    String wordToReturn = new StringBuilder(wordToReverse).reverse().toString();
    LOGGER.info("Word {} was successfully processed. Result {}", wordToReverse, wordToReturn);
    return wordToReturn;
  }
}

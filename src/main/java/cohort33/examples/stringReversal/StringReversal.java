package cohort33.examples.stringReversal;

public class StringReversal {

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

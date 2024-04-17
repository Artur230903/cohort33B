package cohort33.lessons.lesson57_231205_02_multidimensionalArrays;

public class MultidimensionalArrayUtil {

  public static void main(String[] args) {

    String[] books = new String[1];
    books[0] = "Harry Potter";

    System.out.println(books[0]);

    //дву мерный массив
    //  0      1      2       3        4
    //"123", "456", "789", "54687", "7486";      0
    //"848", "8788", "2456", "00216", "8441";    1
    //"2584", "5621", "7814", "68858", "32447";  2

    //3 строки 5 элементов в каждой
    String[][] pinCodes = new String[3][1];
    pinCodes[0][0] = "123";
    pinCodes[1][0] = "848";
    pinCodes[2][0] = "2584";

    String[][] pinCodesReserve =
        {{"123", "456", "789", "54687", "7486"},
            {"848", "8788", "2456", "00216", "8441"},
            {"2584", "5621", "7814", "68858", "32447"}};

    //распечатать точечно
//    System.out.println(pinCodesReserve[0][1]);
//    System.out.println(pinCodesReserve[1][2]);

    //распечатать всё
    for (int i = 0; i < pinCodesReserve.length; i++) {
      for (int j = 0; j < pinCodesReserve[i].length; j++) {
        System.out.println(pinCodesReserve[i][j]);

      }
    }
  }

}

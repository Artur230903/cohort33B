package cohort33.homeworks.homework44;

//import static cohort33.homeworks.homework44.LibraryCatalog.addBookLibraryCatalog;
//import static cohort33.homeworks.homework44.LibraryCatalog.findBookByTitleMyMethod;
//import static cohort33.homeworks.homework44.LibraryCatalog.removeBookLibraryCatalog;

import java.util.List;

public class LibraryApp {

  public static void main(String[] args) {
//Решения Игоря *-*-*-*-*-*-*-
    Book bookServantes = new Book("Don Kihot", "Servantes", "111-222-333");
    Book bookKing = new Book("Langoleri", "King", "111-555-666");
    Book bookServantesSecond = new Book("Don Kihot", "Servantes", "111-222-333");

    LibraryCatalog libraryCatalog = new LibraryCatalog();
    libraryCatalog.addBook(bookServantes);
    libraryCatalog.addBook(bookKing);
    libraryCatalog.addBook(bookServantesSecond);

    List<Book> books = libraryCatalog.findBookByTitle("Don Kihot");
    for (Book book : books) {
      System.out.println(book.toString());
    }

//Решения Игоря *-*-*-*-*-*-*-

//Мои решения *=*=*=*=*=*=*=
//    Scanner scanner = new Scanner(System.in);

//    boolean isRun = true;
//
//    while (isRun){
//      System.out.println("1. Add Book to Library");
//      System.out.println("2. Remove Book from Library");
//      System.out.println("3. Search for Book");
//      System.out.println("4. Show all Books in Library");
//      System.out.println("0. Exit the Library");
//
//      int command = scanner.nextInt();
//      scanner.close();
//      switch (command){
//        case 1:
//          System.out.print("Enter Author name of the Book: ");
//
//          String scanerAuthorName = scanner.nextLine();
//
//          System.out.println("name is " + scanerAuthorName);

//          scanner.close();

//          System.out.println(scanerAuthorName);
//          System.out.println("Enter Book name");
//          String scanerBookName = scanner.nextLine();
//          break;
//
//        case 4:
//          showAllBooks();
//          break;
//        case 0:
//          isRun = false;
//          break;
//        default:
//          System.out.println("Unknown command");
//          break;
//
//      }
//    }

//    int counterToSeparate = 1;
//
//    System.out.println("-----" + (counterToSeparate++) + "-----");
//    Book bookTwistedDreams = new Book("Huang Ana", "Twisted Dreams");
//    addBookLibraryCatalog(bookTwistedDreams);
//    showAllBooks();
//
//    System.out.println("-----" + (counterToSeparate++) + "-----");
//    Book bookFallenPrincess = new Book("Kasten Mona", "fallen Princess");
//    addBookLibraryCatalog(bookFallenPrincess);
//    showAllBooks();
//
//    System.out.println("-----" + (counterToSeparate++) + "-----");
//    removeBookLibraryCatalog(bookTwistedDreams);
//    showAllBooks();
//
//    System.out.println("-----" + (counterToSeparate++) + "-----");
//    findBookByTitle("Twisted Dreams");
//
//    System.out.println("-----" + (counterToSeparate++) + "-----");
//    addBookLibraryCatalog(bookTwistedDreams);
//    showAllBooks();
//    findBookByTitle("Twisted Dreams");

  }

}

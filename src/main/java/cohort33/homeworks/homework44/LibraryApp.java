package cohort33.homeworks.homework44;

import static cohort33.homeworks.homework44.LibraryCatalog.addBookLibraryCatalog;
import static cohort33.homeworks.homework44.LibraryCatalog.findBookByTitle;
import static cohort33.homeworks.homework44.LibraryCatalog.removeBookLibraryCatalog;
import static cohort33.homeworks.homework44.LibraryCatalog.showAllBooks;

public class LibraryApp {

  public static void main(String[] args) {

    int counterToSeparate = 1;

    System.out.println("-----" + (counterToSeparate++) + "-----");
    Book bookTwistedDreams = new Book("Huang Ana", "Twisted Dreams");
    addBookLibraryCatalog(bookTwistedDreams);
    showAllBooks();

    System.out.println("-----" + (counterToSeparate++) + "-----");
    Book bookFallenPrincess = new Book("Kasten Mona", "fallen Princess");
    addBookLibraryCatalog(bookFallenPrincess);
    showAllBooks();

    System.out.println("-----" + (counterToSeparate++) + "-----");
    removeBookLibraryCatalog(bookTwistedDreams);
    showAllBooks();

    System.out.println("-----" + (counterToSeparate++) + "-----");
    findBookByTitle("Twisted Dreams");

    System.out.println("-----" + (counterToSeparate++) + "-----");
    addBookLibraryCatalog(bookTwistedDreams);
    showAllBooks();
    findBookByTitle("Twisted Dreams");




  }

}

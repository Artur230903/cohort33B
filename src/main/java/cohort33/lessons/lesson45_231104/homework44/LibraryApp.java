package cohort33.lessons.lesson45_231104.homework44;

import java.util.List;

public class LibraryApp {

  public static void main(String[] args) {
    int counterToSeparate = 1;

    System.out.println("-----" + (counterToSeparate++) + "-----");
    Book bookServantes = new Book("Дон Кихот", "Сервантес", "111-222-333");
    Book bookKing = new Book("Лангольеры", "Кинг", "111-555-666");
    Book bookServantesSecond = new Book("Дон Кихот", "Сервантес", "111-222-333");

    LibraryCatalog libraryCatalog = new LibraryCatalog();

    libraryCatalog.addBook(bookServantes);
    libraryCatalog.addBook(bookKing);
    libraryCatalog.addBook(bookServantesSecond);

    System.out.println("-----" + (counterToSeparate++) + "-----");
    List<Book> books = libraryCatalog.findBookByTitle("Дон Кихот");
    for (Book book : books) {
      System.out.println(book.toString());
    }

    System.out.println("-----" + (counterToSeparate++) + "-----");
    books = libraryCatalog.findBookByTitle(null);
    if (books != null) {
      for (Book book : books) {
        System.out.println(book.toString());
      }
    } else {
      System.out.println("books == null");
    }

    System.out.println("-----" + (counterToSeparate++) + "-----");
    books = libraryCatalog.findBookByTitle("Нет такой книги");
    System.out.println("Найдено " + books.size() + " книг");
    for (Book book : books) {
      System.out.println(book.toString());
    }

    System.out.println("-----" + (counterToSeparate++) + "-----");
    books = libraryCatalog.getBooks();
    System.out.println("В библиотеке " + books.size() + " книг");
    for (Book book : books) {
      System.out.println(book.toString());
    }

    System.out.println("-----" + (counterToSeparate++) + "-----");
    libraryCatalog.removeBook("111-222-333");
    books = libraryCatalog.getBooks();
    System.out.println("В библиотеке " + books.size() + " книг");
    for (Book book : books) {
      System.out.println(book.toString());
    }

    System.out.println("-----" + (counterToSeparate++) + "-----");
    libraryCatalog.listAllBooks();
  }

}

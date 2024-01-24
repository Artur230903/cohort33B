package cohort33.homeworks.homework46;

import static cohort33.homeworks.homework46.UsersDB.arrayUserList;
import static cohort33.homeworks.homework46.UsersDB.showUsersInfo;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner inputScanner = new Scanner(System.in);

    System.out.println("Input accaunt name:");
    String accName = inputScanner.nextLine();

    System.out.println("Input password");
    String password = inputScanner.nextLine();
    inputScanner.close();

    User user01 = new User(accName, password);

    arrayUserList.add(user01);

    showUsersInfo();
  }

}

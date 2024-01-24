package cohort33.homeworks.homework46;

import java.util.ArrayList;
import java.util.List;

public class UsersDB {

  public static List<User> arrayUserList = new ArrayList<>();

  public static void showUsersInfo() {
    for (User user : arrayUserList) {
      System.out.println(user.toString());
    }
  }

}

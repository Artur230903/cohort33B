package cohort33.lessons.lesson47_231109.homework46;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserPassValidator {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserPassValidator.class);

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    boolean validateResult = false;

    System.out.println("Input username or `exit` for exit:");

    while (!validateResult) {

      //First
      try {
        String username = scanner.nextLine();
        username.charAt(0);
        System.out.println("Username: " + username);
        if (username.equals("exit")) {
          break;
        }

        System.out.println("Input password: ");
        String password = scanner.next();
        boolean result = validatePassword(password);
        if (result) {
          System.out.println("Учётная запись успешно создана.");
          LOGGER.info("User account was created {}.", username);
          validateResult = true;
        }

      } catch (IndexOutOfBoundsException exception) {
        System.out.println("Имя пользователя не может быть пустым.");
        LOGGER.error("Username is empty.", exception);
      }
    }
    scanner.close();

    //Second
//    try {
//      if (username.length() == 0) {
//        throw new WrongArgumentsException("Username is empty");
//      }
//    } catch (WrongArgumentsException exception) {
//
//    }

  }

  private static boolean validatePassword(String password) {
    try {
      if (password.length() < 8 || !(password.contains("@") ||
          password.contains("!") || password.contains("#"))
          || !password.matches(".*\\d.*")) {
        throw new IllegalArgumentException(
            "Password length must be 8 symbols and include one number and include special character.");

      } else {
        return true;
      }
    } catch (IllegalArgumentException exception) {
      LOGGER.error("Password is wrong: {}", password, exception);
      System.out.println("Ошибка: Пароль должен быть не менее 8 символов и "
          + "содержать хотя бы одну цифру и один специальный символ.");
      return false;
    }
  }
}


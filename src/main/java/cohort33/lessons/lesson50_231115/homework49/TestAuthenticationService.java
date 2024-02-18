package cohort33.lessons.lesson50_231115.homework49;

public class TestAuthenticationService {

  private static AuthenticationService authenticationService;

  public static void main(String[] args) {
    authenticationService = new AuthenticationService();
    boolean result = authenticationService.authenticate("user111", "pass123");
    System.out.println(result);
  }

}

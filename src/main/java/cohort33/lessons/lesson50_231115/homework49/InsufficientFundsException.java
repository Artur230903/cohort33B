package cohort33.lessons.lesson50_231115.homework49;

public class InsufficientFundsException extends RuntimeException {

  public InsufficientFundsException(String message, double balance, double amount) {
    super(message + "Balance: " + balance + " Amount: " + amount);
  }
}

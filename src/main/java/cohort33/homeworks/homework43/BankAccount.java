package cohort33.homeworks.homework43;

public class BankAccount {

  private String owner;

  private double balance;

  public BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
  }
  public double deposit(double amount){
    return balance = balance + amount;
  }

  public double getBalance() {
    return balance;
  }
}

package cohort33.homeworks.homework43;

public class Main {

  public static void main(String[] args) {

    int counterToSeparate = 1;

    System.out.println("-----" + (counterToSeparate++) + "-----");
    BankAccount bankAccountViktor = new BankAccount("Viktor", 1538.79);
    bankAccountViktor.deposit(-300.00);
    System.out.println("€" + bankAccountViktor.getBalance());

    System.out.println("-----" + (counterToSeparate++) + "-----");
    bankAccountViktor.deposit(750.00);
    System.out.println("€" + bankAccountViktor.getBalance());

    System.out.println("-----" + (counterToSeparate++) + "-----");
    bankAccountViktor.withdraw(2500.00);
    System.out.println("€" + bankAccountViktor.getBalance());

    System.out.println("-----" + (counterToSeparate++) + "-----");
    bankAccountViktor.withdraw(2000.00);
    System.out.println("€" + bankAccountViktor.getBalance());

    System.out.println("-----" + (counterToSeparate++) + "-----");
    bankAccountViktor.checkBalance();

  }

}

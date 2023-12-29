package cohort33.homeworks.homework43;

import java.util.logging.Logger;

public class Main {

  public static void main(String[] args) {

    int counterToSeparate = 1;

    System.out.println("-----" +(counterToSeparate++) + "-----");
    BankAccount bankAccountViktor = new BankAccount("Viktor", 1538.78);
    bankAccountViktor.deposit(500);
    System.out.println(bankAccountViktor.getBalance());


  }

}

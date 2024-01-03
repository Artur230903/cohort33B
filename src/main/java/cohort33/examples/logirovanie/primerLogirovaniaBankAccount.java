package cohort33.examples.logirovanie;

import static cohort33.examples.colors.colors.ANSI_BLUE;
import static cohort33.examples.colors.colors.ANSI_RED;
import static cohort33.examples.colors.colors.ANSI_RESET;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class primerLogirovaniaBankAccount {

  private static final Logger LOGGER = LoggerFactory.getLogger(primerLogirovaniaBankAccount.class);

  private String owner;

  private double balance;

  public primerLogirovaniaBankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
  }

  public void deposit(double amountDeposit) {
    if (amountDeposit > 0) {
      balance = balance + amountDeposit;
      LOGGER.info("Счет владельца {} пополнен на сумму € {}", owner, amountDeposit);
    } else{
      System.out.println(ANSI_RED + "Неверная сумма!" + ANSI_RESET);
      LOGGER.error("С счета {} была попытка снять сумму € {}",owner,amountDeposit);
    }
  }


  public void withdraw(double amountWithdraw){
    if (amountWithdraw > balance){
      System.out.println(ANSI_RED + "Недостаточно средств на счету!" + ANSI_RESET);
      LOGGER.error("На счете {} находяться средства на сумму € {}, данную сумму снять невозможно", owner, getBalance());
    }else {
      balance = balance - amountWithdraw;
      LOGGER.info("На счете {} осталось средств на сумму € {}", owner, getBalance());
    }
  }

  public double checkBalance(){
    System.out.println(ANSI_BLUE + "Ваш текущий баланс составляет: €" + balance + ANSI_RESET);
    LOGGER.debug("Сделан запрос на текущи баланс счета {}",owner);
    return balance;
  }

  public double getBalance() {
    return balance;
  }
}

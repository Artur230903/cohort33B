package cohort33.homeworks.homework43;

import static org.junit.jupiter.api.Assertions.*;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

  private BankAccount bankAccountMustermann;

  @BeforeEach
  void setUp() {
    bankAccountMustermann = new BankAccount("Mustermann",0);
  }

  @Test
  void testDepositAmountPositivSuccess() {
    bankAccountMustermann.deposit(100);
    Assertions.assertEquals(100,bankAccountMustermann.checkBalance());

    //TODO
//    LogCaptor logCaptor = LogCaptor.forClass(BankAccount.class);
//    String expectedInfoMessage = "Счет владельца Mustermann пополнен на сумму € 100";
//    Assertions.assertTrue(logCaptor.getInfoLogs().contains(expectedInfoMessage));

  }

  @Test
  void withdraw() {
  }

  @Test
  void checkBalance() {
  }
}
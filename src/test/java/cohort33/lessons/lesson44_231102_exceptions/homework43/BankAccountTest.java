package cohort33.lessons.lesson44_231102_exceptions.homework43;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankAccountTest {

    LogCaptor logCaptor = LogCaptor.forClass(BankAccount.class);

    private BankAccount bankAccountMustermann;

    private BankAccount bankAccountMueller;

    @BeforeEach
    void setUp() {
        bankAccountMustermann = new BankAccount("Mustermann", 0);
        bankAccountMueller = new BankAccount("Mueller", 500);
    }

    @Test
    void testDepositAmountPositivSuccess() {

        logCaptor.setLogLevelToInfo();
        bankAccountMustermann.deposit(100);
        Assertions.assertEquals(100, bankAccountMustermann.checkBalance());

        String expectedInfoMessage = "Аккаунт владельца Mustermann пополнен на сумму 100.0 €";
        Assertions.assertTrue(logCaptor.getInfoLogs().contains(expectedInfoMessage));
    }

    @Test
    void testDepositAmountNegativFail() {
        bankAccountMustermann.deposit(-10);
        Assertions.assertEquals(0, bankAccountMustermann.checkBalance());
    }

    @Test
    void withdrawBalanceOkSuccess() {
        bankAccountMueller.withdraw(100);
        Assertions.assertEquals(400, bankAccountMueller.checkBalance());
    }

    @Test
    void withdrawBalanceNotEnoughFail() {
        bankAccountMueller.withdraw(1000);
        Assertions.assertEquals(500, bankAccountMueller.checkBalance());
    }

    @Test
    void checkBalance() {
        bankAccountMueller.deposit(-200);
        Assertions.assertEquals(500, bankAccountMueller.checkBalance());
    }
}
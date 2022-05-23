package practices;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    void setUp(){
        account = new Account("Adeola");
        System.out.println("Account creation");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Done");
    }

    @Test
//    @DisplayName("Test that account has an account name")
    void testThatAccountHasAName(){
        // Given
        Account acc = new Account("Rachael");
        // When
        String name = acc.getAccountName();

        // assert
        assertEquals("Rachael", name);
        System.out.println("Test1");
    }

    @Test
    @DisplayName("Test that Account name can be set")
    void test2(){
        // Given
        assertEquals("Adeola", account.getAccountName());

        // when
        account.setAccountName("Baby");

        // assert

        assertEquals("Baby", account.getAccountName());
        System.out.println("Test2");
    }

    @Test
    void  testThatAccountCanHaveAccountNumber(){
        account.setAccountNumber("12345678901");
        assertEquals("12345678901", account.getAccountNumber());
    }

    @Test
    void testThatDepositCanBeMade(){
        account.deposit(5000);

        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void testThatDepositingNegativeAmountThrowsAnException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-2000));
        assertEquals("Invalid amount", exception.getMessage());
        assertEquals(0, account.getAccountBalance());
    }

    @Test
    void testThatWithdrawalCanOccur(){
        account.deposit(10000);
        account.withdraw(3000);
        assertEquals(7000, account.getAccountBalance());
    }

    @Test
    void testThatYouCanNotWithDrawANegativeAmount(){
        IllegalArgumentException exception =assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10000));
        assertEquals("Invalid amount", exception.getMessage());
        assertEquals(0, account.getAccountBalance());
    }

    @Test
    void testThatYouCanNotWithdrawMoreThanYouHave(){
        account.deposit(10000);
        IllegalArgumentException exception =assertThrows(IllegalArgumentException.class, () -> account.withdraw(70000));
        assertEquals("insufficient amount", exception.getMessage());
//        assertEquals(10000, account.getAccountBalance());
//        System.out.println(account.getAccountBalance());

    }

}
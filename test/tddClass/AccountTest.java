package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){

        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(100);
        //assert
        assertEquals(100, ucheAccount.getBalance());

    }

    @Test
    public void depositMultipleTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(100);
        ucheAccount.deposit(500);
        ucheAccount.deposit(600);
        //assert
        assertEquals(1200, ucheAccount.getBalance());

    }

    @Test

    public void negativeDepositTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(1000);
        ucheAccount.deposit(-400);
        //assert
        assertEquals(1000, ucheAccount.getBalance());
    }

    @Test
    public  void despositWithdrawTes(){
        Account ucheAccount = new Account();

        //when
        ucheAccount.deposit(5000);

        //assert

        assertEquals(5000, ucheAccount.getBalance());

        ucheAccount.withdraw(3000);
        assertEquals(2000, ucheAccount.getBalance());
    }

    @Test
    public void withdrawalTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.withdraw(2000);

        //assert
        assertEquals(0, ucheAccount.getBalance());
    }

    @Test
    public void withdrawMoreTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.withdraw(10000);

        //assert
        assertEquals(0, ucheAccount.getBalance());
    }

    @Test
    public void withdrawMoreThanWeHaveTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.withdraw(10000);

        //assert
        assertEquals(0, ucheAccount.getBalance());
    }
}


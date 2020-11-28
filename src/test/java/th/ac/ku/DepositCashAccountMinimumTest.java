package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashAccountMinimumTest {

    @Test
    public void deposit_less_than_100_to_account_with_100_minimum_should_be_false() {
        // arrange
        final boolean expectedResult = false;
        final float depositAmount = 50;
        final Account account = new Account("1", 100);

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositMinimum(depositAmount, account);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_100_to_account_with_100_minimum_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 100;
        final Account account = new Account("1", 100);

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositMinimum(depositAmount, account);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_more_than_100_to_account_with_100_minimum_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 150;
        final Account account = new Account("1", 100);

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositMinimum(depositAmount, account);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}

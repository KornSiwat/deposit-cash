package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashInOneDayTest {

    @Test
    public void deposit_less_than_50000_in_one_day_result_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 5000;
        final float depositedAmount = 30000;

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositPerDay(depositAmount,
                depositedAmount);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_50000_in_one_day_result_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 25000;
        final float depositedAmount = 25000;

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositPerDay(depositAmount,
                depositedAmount);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_less_than_50000_in_one_day_result_should_be_false() {
        // arrange
        final boolean expectedResult = false;
        final float depositAmount = 15000;
        final float depositedAmount = 45000;

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositPerDay(depositAmount,
                depositedAmount);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}

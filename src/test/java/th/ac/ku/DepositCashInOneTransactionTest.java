package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashInOneTransactionTest {

    @Test
    public void deposit_less_than_30000_in_one_transaction_result_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 5000;

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositPerTransaction(depositAmount);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_30000_in_one_transaction_result_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 30000;

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositPerTransaction(depositAmount);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_more_than_30000_in_one_transaction_result_should_be_false() {
        // arrange
        final boolean expectedResult = false;
        final float depositAmount = 35000;

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositPerTransaction(depositAmount);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}

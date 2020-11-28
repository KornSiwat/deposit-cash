package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountStatusTest {

    @Test
    public void use_unsuspended_account_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final String accountID = "0343501943";

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkAccountStatus(accountID);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void use_suspended_account_should_be_false() {
        // arrange
        final boolean expectedResult = false;
        final String accountID = "123456";

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkAccountStatus(accountID);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}

package th.ac.ku;

import java.util.Arrays;

public class Agent {
    private final AccountFacade accountFacade = new AccountFacade();
    private final float depositPerTransactionLimit = 30000;
    private final float dailyDepositLimit = 50000;

    public boolean checkDepositPerTransaction(float depositAmount) {
        boolean depositAmountNotExceedDepositPerTransactionLimit =
                depositAmount <= depositPerTransactionLimit;

        return depositAmountNotExceedDepositPerTransactionLimit;
    }

    public boolean checkDepositPerDay(float depositAmount,
                                            float depositedAmount) {
        boolean sumOfDepositAmountAndDepositedAmountNotExceedDailyDepositLimit =
                (depositAmount + depositedAmount) <= dailyDepositLimit;

        return sumOfDepositAmountAndDepositedAmountNotExceedDailyDepositLimit;
    }

    public boolean checkAccountStatus(String accountID) {
        String[] suspendedAccountIDs = accountFacade.getSuspendedAccountIDs();
        boolean isAccountIDNotInSuspendedAccountIDs = !Arrays
                .asList(suspendedAccountIDs).contains(accountID);

        return isAccountIDNotInSuspendedAccountIDs;
    }

    public boolean checkDepositMinimum(float depositAmount, Account account) {
        float accountMinimumDepositAmount = account.getMinimumDepositAmount();
        boolean isDepositAmountSatisfiedAccountMinimumDepositAmount =
                depositAmount >= accountMinimumDepositAmount;
        return isDepositAmountSatisfiedAccountMinimumDepositAmount;
    }
}

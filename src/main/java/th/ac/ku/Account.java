package th.ac.ku;

public class Account {
    private String ID;
    private float minimumDepositAmount;

    public Account(String ID, float minimumDepositAmount) {
        this.ID = ID;
        this.minimumDepositAmount = minimumDepositAmount;
    }

    public String getID() {
        return ID;
    }

    public float getMinimumDepositAmount() {
        return minimumDepositAmount;
    }
}

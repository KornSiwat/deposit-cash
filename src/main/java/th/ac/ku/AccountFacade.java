package th.ac.ku;

public class AccountFacade {

    public String[] getSuspendedAccountIDs() {
        return new String[] {"123456"};
    }

    public Account getAccountByID(String ID) {
        return new Account(ID, 100);
    }
}

package bankapp.Accounts;

public class SilverCheckingAccount extends CheckingAccount {
    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    public int calculateRewardPoints(double cost) {
        return (int) (cost * 0.25);
    }
}

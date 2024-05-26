package bankapp.Accounts;

public class DiamondCheckingAccount extends CheckingAccount {
    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }  
    
    public int calculateRewardPoints(double cost) {
        int rewards = 0;

        if (cost > 500) {
            rewards += (cost - 500) * 80;
            cost = 500;
        }
        if (cost > 100) {
            rewards += (cost -100) * 80;
            cost = 100;
        }
        rewards += cost * 40;
        return rewards;
    }
}

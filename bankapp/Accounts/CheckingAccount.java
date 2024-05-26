package bankapp.Accounts;

public class CheckingAccount extends Account {
    public int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        
        /* a sub class overrides a method in the super class. 
        A sub class is able to provide a different implementation of the inherited method,
        if it does not like how an inherited method works it may change it */

        //super(50, 0.072);
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
        System.out.println("CheckingAccount constructor");
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;            
        }
        balance -= cost;
        // rewardPoints += cost * 100; replace by calculateRewardPoints method
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public int calculateRewardPoints(double cost) {
        return (int) (cost * 10);
    }
    
    public int getRewardPoints() {
        return rewardPoints;
    }
    
}

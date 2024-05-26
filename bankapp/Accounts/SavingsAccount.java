package bankapp.Accounts;

public class SavingsAccount extends Account {

    public SavingsAccount (double balance, double interestRate) {
        super(balance, interestRate);
    }

    // overriding withdraw method of Account class
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;

        amount += fee;

        /* replace this code here with "Super" 
        to avoid duplication as it is also found in Account class

        if (amount > balance) {
            return false;
        }      
        balance -= amount;
        return true;
        */

        return super.withdraw(amount);
    }

    @Override //annotation isn't necessary but 
    public void deposit(double amount) {
        super.deposit(amount);
    }
}

package bankapp.Accounts;

public class Account {
    //private double balance;
    protected double balance; // changed from private to allow access from checkingAccount but not from other classes
    private double interestRate;

    /* default implicit constructor created by java if prgrammer does not create any constructor
    public Account() {

    } */

    /*  Overload means more then one constructor is created in a class
    public Account() {
        System.out.println("Account constructor");
    } */

    public Account(double balance, double interestRate) {
        this .balance = balance;
        this.interestRate = interestRate;
    } 

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n",balance);
    }
}

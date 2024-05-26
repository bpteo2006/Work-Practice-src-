package bankapp;

import bankapp.Accounts.Account;
import bankapp.Accounts.CheckingAccount;
import bankapp.Accounts.SavingsAccount;
import bankapp.Accounts.SilverCheckingAccount;
import bankapp.Accounts.GoldCheckingAccount;
import bankapp.Accounts.DiamondCheckingAccount;

public class Main {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(100, 0.042, 700);
        /* 
        Account account = new Account(100, 0.025);
        account.status();
        account.withdraw(45.86);
        account.status();
        account.withdraw(62.96); 

        account.status(); 
        account.deposit(32.50);
        account.status(); */

        System.out.println(account.getRewardPoints());
        if (account.purchase(10.03) ) {
            System.out.println("Purchase successfull");
        }
        else {
            System.out.println("Purchase failed");
        }

        System.out.println(account.getRewardPoints());

        SavingsAccount sa = new SavingsAccount(100, 0.045);

        account.status();
        sa.status();

        account.withdraw(10);
        sa.withdraw(10);

        account.status();
        sa.status();

        SilverCheckingAccount silver = new SilverCheckingAccount(5000, 0.025, 1000);
        GoldCheckingAccount gold = new GoldCheckingAccount(5000,0.025, 1000);
        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000, 0.025, 1000);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(500);
        gold.purchase(500);
        diamond.purchase(500);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

    } 
}

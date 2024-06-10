package com.bank.main;

import com.bank.account.SavingsAccount;
import com.bank.account.CheckingAccount;
import com.bank.management.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings1 = new SavingsAccount(101, "Alice", 1000.0, 5.0);
        SavingsAccount savings2 = new SavingsAccount(102, "Bob", 2000.0, 4.0);
        
        CheckingAccount checking1 = new CheckingAccount(201, "Charlie", 1500.0, 500.0);
        CheckingAccount checking2 = new CheckingAccount(202, "Dave", 1000.0, 300.0);

        bank.addAccount(savings1);
        bank.addAccount(savings2);
        bank.addAccount(checking1);
        bank.addAccount(checking2);

        System.out.println("Initial account details:");
        bank.displayAccounts();

        System.out.println("\nDepositing $500 to Alice's savings account:");
        savings1.deposit(500);
        System.out.println(savings1.getAccountInfo());

        System.out.println("\nWithdrawing $2500 from Charlie's checking account:");
        checking1.withdraw(2500);
        System.out.println(checking1.getAccountInfo());

        System.out.println("\nRemoving Dave's checking account:");
        bank.removeAccount(202);

        System.out.println("\nFinal account details:");
        bank.displayAccounts();
    }
}

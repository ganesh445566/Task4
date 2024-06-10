package com.bank.account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Checking");
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
        if (balance < 0) {
            System.out.println("Overdraft limit reached.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or overdraft limit reached.");
        }
    }

    @Override
    public String getAccountInfo() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + 
               ", Balance: " + balance + ", Overdraft Limit: " + overdraftLimit;
    }
}

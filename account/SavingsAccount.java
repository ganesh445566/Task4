package com.bank.account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public String getAccountInfo() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + 
               ", Balance: " + balance + ", Interest Rate: " + interestRate + "%";
    }
}

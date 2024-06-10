package com.bank.account;

public abstract class Account {
    public int accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected String accountType;
// para meter constructor define
    public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
//Abstract Methods defines

    public abstract void deposit(double amount);// use this method deposit money in acc
    public abstract void withdraw(double amount);// use this method withdraw money in acc
    public abstract String getAccountInfo();// information about the account,n about the account, such as the 
}

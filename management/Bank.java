package com.bank.management;

import java.util.ArrayList;
import java.util.List;
import com.bank.account.Account;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int accountNumber) {
        accounts.removeIf(account -> account.accountNumber == accountNumber);
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }
    }
}

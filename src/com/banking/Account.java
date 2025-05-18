package com.banking;

public abstract class Account implements AccountOperations {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void showAccountType();
}

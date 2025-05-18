package com.banking;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

package com.banking;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = null;

        System.out.println("Select Bank Type:\n1. Nationalized\n2. Cooperative");
        int bankChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Bank Name: ");
        String bankName = scanner.nextLine();
        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();

        if (bankChoice == 1) {
            bank = new NationalizedBank(bankName, branchName);
        } else if (bankChoice == 2) {
            bank = new CooperativeBank(bankName, branchName);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("Select Account Type:\n1. Savings\n2. Current\n3. Loan");
        int accType = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        String holderName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        String accNum = "ACC" + (int)(Math.random() * 1000 + 100);
        Account account = null;

        switch (accType) {
            case 1:
                account = new SavingsAccount(accNum, holderName, balance);
                break;
            case 2:
                account = new CurrentAccount(accNum, holderName, balance);
                break;
            case 3:
                account = new LoanAccount(accNum, holderName, balance);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }

        bank.openAccount(account);
        bank.displayBankInfo();

        System.out.println("--- Account Details ---");
        account.showAccountType();
        System.out.println("Holder: " + account.getHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
    }
}


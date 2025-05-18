package com.banking;

public class LoanAccount extends Account {
    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Loan Account");
    }

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
}


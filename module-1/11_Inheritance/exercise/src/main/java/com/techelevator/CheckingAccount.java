package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public int withdraw(int amountToWithdraw) {
        int b = getBalance() - amountToWithdraw;
        if ((getBalance() - amountToWithdraw) <= -100) {
            return getBalance();
        }
        if (b > 0) {
            super.withdraw(amountToWithdraw);
        }
        if (b < 0 && b >= -100) {
            amountToWithdraw += 10;
            super.withdraw(amountToWithdraw);
        }

        return getBalance();

    }

}

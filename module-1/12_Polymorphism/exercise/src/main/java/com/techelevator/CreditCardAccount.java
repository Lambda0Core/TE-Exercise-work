package com.techelevator;

public class CreditCardAccount implements Accountable {
    //properties
    private String accountHolder;
    private String accountNumber;
    private static int debt;
    //constructor
    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        debt = 0;
    }
    //getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static int getDebt() {
        return debt;
    }
    //method
    public int pay(int amountToPay) {
        return debt -= amountToPay;
    }

    public int charge(int amountToCharge) {
        return debt += amountToCharge;
    }



    public int getBalance() {

        return -debt;
    }





}

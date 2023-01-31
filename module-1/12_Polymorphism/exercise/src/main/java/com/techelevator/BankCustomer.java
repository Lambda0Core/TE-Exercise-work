package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    //properties
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    //constructor
    public BankCustomer(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this. accounts = accounts;
    }
    public BankCustomer(){

    }
    //getters and setters
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }
    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);
    }
    //method
    public boolean isVip() { // not working
        int total = 0; // holds the value of the combine account balances

        for (int i = 0; i < accounts.size(); i++) {
            total += accounts.get(i).getBalance(); // add the account balances to total
        }
        if (total >= 25000) {
            return true;
        } else {
            return false;
        }




    }


}

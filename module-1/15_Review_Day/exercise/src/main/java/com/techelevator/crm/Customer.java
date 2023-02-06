package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    //properties
    private String phoneNumber;
    private List<String> pets = new ArrayList<String>();
    //constructor
    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName){
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue = 0.0;
        for (String service : servicesRendered.keySet()) {
            balanceDue += servicesRendered.get(service);
        }
        return balanceDue;
    }
}

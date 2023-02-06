package com.techelevator.crm;

import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    @Test
    public void getBalanceDue() {
        Customer customer = new Customer("Test", "Dummy");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Nail Trim", 12.00);
        testMap.put("Walking", 23.00);
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);
        testMap.put("Grooming", 35.00);
        double methodTotal = customer.getBalanceDue(testMap);
        Assert.assertEquals("The customer's balance due is not correct.", 135.00, methodTotal, 0.0);
    }
}

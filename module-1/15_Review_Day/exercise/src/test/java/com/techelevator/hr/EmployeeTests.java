package com.techelevator.hr;

import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }
    @Test
    public void getBalanceDue() {
        Employee employee = new Employee("Joe", "Sixpack");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Nail Trim", 12.00);
        testMap.put("Walking", 23.00);
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);
        testMap.put("Grooming", 35.00);
        double methodTotal = employee.getBalanceDue(testMap);
        Assert.assertEquals("The employee's balance due is not correct. Did you remember to include the 50% discount on walking serivces?", 123.5, methodTotal, 0.0);
    }
}

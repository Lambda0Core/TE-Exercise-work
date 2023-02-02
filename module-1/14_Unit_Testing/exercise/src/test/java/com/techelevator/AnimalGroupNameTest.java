package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalGroupNameTest {

    AnimalGroupName testMethods = new AnimalGroupName();

    @Test
    public void test_for_Rhino() {
        assertEquals("Incorrect String returned from getHeard", "Crash", testMethods.getHerd("Rhino"));
    }

    @Test
    public void test_for_Giraffe() {
        assertEquals("Incorrect String returned from getHeard", "Tower", testMethods.getHerd("Giraffe"));
    }

    @Test
    public void test_for_Elephant() {
        assertEquals("Incorrect String returned from getHeard", "Herd", testMethods.getHerd("Elephant"));
    }

    @Test
    public void test_for_Lion() {
        assertEquals("Incorrect String returned from getHeard", "Pride", testMethods.getHerd("Lion"));
    }

    @Test
    public void test_for_Crow() {
        assertEquals("Incorrect String returned from getHeard", "Murder", testMethods.getHerd("Crow"));
    }

    @Test
    public void test_for_Pigeon() {
        assertEquals("Incorrect String returned from getHeard", "Kit", testMethods.getHerd("Pigeon"));
    }

    @Test
    public void test_for_Flamingo() {
        assertEquals("Incorrect String returned from getHeard", "Pat", testMethods.getHerd("Flamingo"));
    }

    @Test
    public void test_for_Deer() {
        assertEquals("Incorrect String returned from getHeard", "Herd", testMethods.getHerd("Deer"));
    }

    @Test
    public void test_for_Dog() {
        assertEquals("Incorrect String returned from getHeard", "Pack", testMethods.getHerd("Dog"));
    }

    @Test
    public void test_for_Crocodile() {
        assertEquals("Incorrect String returned from getHeard", "Float", testMethods.getHerd("Crocodile"));
    }

    @Test
    public void test_for_null() {
        assertEquals("Incorrect String returned from getHeard", "unknown", testMethods.getHerd(null));
    }

    @Test
    public void test_for_unknown_animal() {
        assertEquals("Incorrect String returned from getHeard", "unknown", testMethods.getHerd("Zebras"));
    }

}

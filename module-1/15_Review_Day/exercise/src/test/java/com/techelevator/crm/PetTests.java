package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class PetTests {


    @Test
    public void listVaccinations() {
        //arrange
        Pet classTest = new Pet("Test Name", "Test Species");
        //act
        List<String> testList = new ArrayList<>();
        testList.add("Rabies");
        testList.add("Distemper");
        testList.add("Parvo");
        classTest.setVaccinations(testList);
        //assert
        Assert.assertEquals("Rabies, Distemper, Parvo", classTest.listVaccinations());
    }
}

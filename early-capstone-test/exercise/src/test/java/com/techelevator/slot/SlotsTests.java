package com.techelevator.slot;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class SlotsTests {


    @Test
    public void listVaccinations() {
        //arrange
//        String expected = "A1, A2, A3, A4, A5";
        //act
        HashMap Slots = new HashMap();
        HashMap<String, String> testList = new HashMap<>();
        testList.put("A1", "");
        testList.put("A2", "");
        testList.put("A3", "");
        testList.put("A4", "");
        testList.put("A5", "");
        testList.put("A6", "");
        testList.put("A7", "");
        testList.put("A8", "");
        testList.put("A9", "");
        testList.put("B1", "");
        testList.put("B2", "");
        testList.put("B3", "");
        testList.put("B4", "");
        testList.put("B5", "");
        testList.put("B6", "");
        testList.put("B7", "");
        testList.put("B8", "");
        testList.put("B9", "");
        //assert
        Map<String, String> expected = new HashMap<>();        testList.put("A1", "");
        testList.put("A2", "");
        testList.put("A3", "");
        testList.put("A4", "");
        testList.put("A5", "");
        testList.put("A6", "");
        testList.put("A7", "");
        testList.put("A8", "");
        testList.put("A9", "");
        testList.put("B1", "");
        testList.put("B2", "");
        testList.put("B3", "");
        testList.put("B4", "");
        testList.put("B5", "");
        testList.put("B6", "");
        testList.put("B7", "");
        testList.put("B8", "");
        testList.put("B9", "");
        //All passed / true

        //1. Test equal, ignore order
        Assert.assertTrue(expected.equals(testList));
    }
}

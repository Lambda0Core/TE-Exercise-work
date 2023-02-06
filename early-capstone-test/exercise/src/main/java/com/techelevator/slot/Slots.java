package com.techelevator.slot;

import java.util.HashMap;

public class Slots {
    //properties
    private String slotName;
    private HashMap vendingSlot = new HashMap();

    //constructor
    public Slots(String slotName) {
        this.slotName = slotName;
    }
    //getter and setter

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    //method
    public String listSlots() {
        String keyList = "";
        for (Object key : vendingSlot.keySet()) {
            keyList += key;
        }
        return keyList;
    }
}

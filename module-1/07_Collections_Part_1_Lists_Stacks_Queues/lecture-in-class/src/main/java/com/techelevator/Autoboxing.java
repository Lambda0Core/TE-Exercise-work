package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            intList.add(Integer.valueOf(i));
        }

        for (Integer item : intList){
            System.out.println(item);
        }
    }
}

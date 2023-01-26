package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Mod1_07Recap {

    public static void main(String[] args) {

        List<String> recapList = new ArrayList<String>();

        recapList.add("einie");
        recapList.add("meanie");
        recapList.add("minie");
        recapList.add("mo");

        printRecap(recapList);

        //find mo index
        int moIndex = recapList.indexOf("mo");
        System.out.println(moIndex);

        //get mo
        String mo = recapList.get(moIndex);
        System.out.println(mo);

//        mo += " has changed";
//        System.out.println(mo);
//        printRecap(recapList);

        recapList.remove(mo);
        printRecap(recapList);

        int[] intArray = {5,4,3,2,1};

        for( int item : intArray){
            System.out.println(item);
        }
    }

    private static void printRecap(List<String> recapList) {
        System.out.println();
        for (String item : recapList){
            System.out.println(item);
        }
    }
}

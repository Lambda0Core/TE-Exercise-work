package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Mod01_07Recap {
    public static void main(String[] args) {
        List<String> recapList = new ArrayList<String>();

        recapList.add("Aristocrat Berea!");
        recapList.add("Aramark!");
        recapList.add("Arby's!");
        recapList.add("Dunkin' Donuts!");

        recapJobs(recapList);

        int aramarkIndex = recapList.indexOf("Aramark!");

        String aramark = recapList.get(aramarkIndex);
        aramark += 2;
        System.out.println(aramark);
        System.out.println(aramarkIndex);
    }

    private static void recapJobs(List<String> recapList) {
        for (int i = 0; i < recapList.size(); i++) {
            System.out.println("Suck it, " + recapList.get(i));

        }
    }
}

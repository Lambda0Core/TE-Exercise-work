package com.techelevator;

public class test {
    public static void main(String[] args) {
	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates,
	    and then divide the total number of rooms to be painted by the combined rate. (goal is 5.043)
	    */
        double billPaintHrs = 1 / 2.15;
        double jillPaintHrs = 1 / 1.90;
        double combined = billPaintHrs + jillPaintHrs;
        int numberOfRooms = 5;
        double totalTime = numberOfRooms / combined;
        System.out.println(totalTime);
    }

}

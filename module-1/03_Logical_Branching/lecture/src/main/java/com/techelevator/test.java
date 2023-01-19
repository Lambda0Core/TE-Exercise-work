package com.techelevator;

public class test {

    public static void main(String[] args) {

        boolean isItFall = false;
        System.out.println(isItFall);
        System.out.println(!isItFall);

        if (isItFall == true) {
            System.out.println("Hibernate");
        } else {
            System.out.println("Spring time!");
        }
        boolean isWinter = false;

        if (isWinter == true) {
            System.out.println("Winter");
        } else {
            System.out.println("Not winter");

        }

        if (5 > 2 && 8 > 7) {
            System.out.println("5 > 2 && 8 > 7    IS TRUE");
        }
        if (7 < 8 && 2 == 2) {
            System.out.println("7 < 8 && 2 == 2    IS TRUE");
        }
        // <= means "7 equals less than 8" while != means "2 DOES NOT equal 2"
        boolean sevenComparison = (7 <= 8);
        boolean twoComparison = (2 != 2);
        boolean nineComparison = (4 + 5 == 9);

        if (sevenComparison && !twoComparison && nineComparison) {
            System.out.println("Compound compare IS TRUE");
        }

        if (sevenComparison || twoComparison) {
            System.out.println("one of the Or statements is true");
        }
        //The two || means "or" and the && means "and"
        if (nineComparison || sevenComparison && twoComparison) {
            System.out.println("dumb comparison is TRUE");
        } else {
            System.out.println("dumb comparison is FALSE");
        }
        int gradePercentage = 90;

        if (gradePercentage >= 90) {
            System.out.println("A");
         } else if (gradePercentage >= 80 && gradePercentage < 90) {
            System.out.println("B");
         } else if (gradePercentage >= 60 && gradePercentage < 70) {
             System.out.println("C");

        }
    }
}

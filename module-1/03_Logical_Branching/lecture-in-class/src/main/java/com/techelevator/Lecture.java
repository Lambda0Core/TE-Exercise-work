package com.techelevator;

public class Lecture {
  /*
    {
        System.out.println(999);
        printHelloWorld();
        int  additionTotal = 0;

        additionTotal = addNumbers(1, 2);
        System.out.println(additionTotal);

        additionTotal = addNumbers(additionTotal, 5);
        System.out.println(additionTotal);

        System.out.println(addNumbers(4,5));


        boolean isItFall = true;
        System.out.println(isItFall);
        System.out.println(!isItFall);

        if (isItFall) {
            System.out.println("ok Hibernation time zzzz.");
        }
        else {
            System.out.println("let's see what the humans are up to!");
        }


        boolean isWinter = false;

        if (isWinter = true) {
            System.out.println("ok Hibernation time zzzz.");
        }
        else {
            System.out.println("I'm starving! Time for breakfast.");
        }


    }



    {
        // Compound Conditional Statements

        if (5 > 2 && 8 > 7) {
            System.out.println("5 > 2 && 8 > 7   IS TRUE");
        }

        if (7 > 8 && 2 == 2) {
            System.out.println("7 < 8 && 2 == 2 IS  TRUE");
        }

        boolean sevenComparision = (7 <= 8);
        boolean twoComparison = (2 != 2);
        boolean nineComparison = (4 + 5 == 9);

        if (sevenComparision && !twoComparison && nineComparison) {
            System.out.println("Compound compare IS  TRUE");
        }

        if (sevenComparision || twoComparison) {
            System.out.println("one of the Or statements is true");
        }

        if (( nineComparison || sevenComparision) && twoComparison){
            System.out.println("dumb comparison is true");
        } else {
                System.out.println("dumb comparison is false");
            }


        int gradePercentage = 70;

        if (gradePercentage >= 90) {
            System.out.println("A");
        } else  if (gradePercentage >= 80 && gradePercentage < 90) {
            System.out.println("B");
        } else  if (gradePercentage >= 70 && gradePercentage < 80) {
            System.out.println("C");
        } else   if (gradePercentage >= 60 && gradePercentage < 70) {
            System.out.println("D");
        } else {
            System.out.println("You need assistance.");
        }

    }
  */

    public void printHelloWorld(){
        System.out.println("Hello World!");
    }

    public int addNumbers(int num1, int num2){
        int total = num1 + num2;
        return total;
    }
    /*
    1. This method is named returnNotOne and it returns an int. Change
    it so that it returns something other than a 1.
    */
    public int returnNotOne() {
        return 2;
    }

    /*
    2. This method is named returnNotHalf and it returns a double. Change
    it so that it returns something other than a 0.5.
    */
    public double returnNotHalf() {
        return 1.5;
    }

    /*
    3. This method needs to return a String. Fix it to return a valid String.
    */
    public String returnName() {
        return "I am valid String";
    }

    /*
    4. This method currently returns an int. Change it so that it returns a double.
    */
    public double returnDoubleOfTwo() {
        return 2.0;
    }

    /*
    5. This method should return the language that you're learning. Change
    it so that it does that.
    */
    public String returnNameOfLanguage() {
        return "Java";
    }

    /*
    6. This method uses an if statement to define what to return. Have it
    return true if the if statement passes.
    */
    public boolean returnTrueFromIf() {
        boolean result = false;

        if (true) {
           result = true;
        }

        return result;
    }

    /*
    7. This method uses an if to check to make sure that one is equal
    to one. Make sure it returns true when one equals one.
    */
    public boolean returnTrueWhenOneEqualsOne() {
        boolean result = false;

        if (1 == 1) {
            result =  true;
        }

        return result;

       // return (1 == 1);
    }

    /*
    8. This method checks a parameter passed to the method to see if it's
    greater than 5 and returns true if it is.
    */
    public boolean returnTrueWhenGreaterThanFive(int number) {
        boolean result = false;

        if (number > 5) {
            result = true;
        }

        return result;

    //     return (number > 5);
    }

    /*
    9. If you think about it, we really don't need the if statement above.
    How can we rewrite exercise 8 to have only one line of code?
    */
    public boolean returnTrueWhenGreaterThanFiveInOneLine(int number) {
        return (number > 5); // What can we put here that returns a boolean that we want?
    }

    /*
    10. This method will take a number and do the following things to it:
    * If addThree is true, we'll add three to that number
    * If addFive is true, we'll add five to that number
    * We'll then return the result
    */
    public int returnNumberAfterAddThreeAndAddFive(int number, boolean addThree, boolean addFive) {
        if (addThree) {
            number += 3;
        }

        // We can't use an else here. They could both be true, so we have to check each one.

        if (addFive) {
            number += 5;
        }

        return number;
    }

    /*
    11. Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
    */
    public String returnFizzIfThree(int number) {
        String result = "";

        if (number == 3) {

            result = "Fizz";
        }
        return result;
    }

    /*
    12. Now write the above using the Ternary operator ?:. If you're not sure what this is, you can Google it.
    */
    public String returnFizzIfThreeUsingTernary(int number) {
//        String result = "";

//        if (number == 3) {
//            result = "Fizz";
//        } else  {
//            result = "";
//        }

//        result = (number == 3) ? "Fizz" : "";
//        return result;

        return (number == 3) ? "Fizz" : "";
    }

    /*
    13. Write an if/else statement that returns "Fizz" if the parameter is 3, "Buzz" if the parameter is 5 and an empty String for anything else.
    */
    public String returnFizzOrBuzzOrNothing(int number) {
        String result = "";

        if (number ==3){
            return "Fizz";
        }

        if (number == 5){
            return "Buzz";
        }
        return result;
    }

    /*
    14. Write an if statement that checks if the parameter number is either equal to or greater than 18. Return "Adult" if it is or "Minor" if it's not.
    */
    public String returnAdultOrMinor(int number) {
        if (number >= 18) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    15. Now, do it again with a different boolean operation.
    */
    public String returnAdultOrMinorAgain(int number) {
       return (number >= 18)? "Adult" : "Minor";
    }

    /*
    16. Return as above, but also return "Teen" if the number is between 13 and 17 inclusive.
    */
    public String returnAdultOrMinorOrTeen(int number) {
        if (number >= 18) {
            return "Adult";
        } else if (number >= 13 && number <= 17) {
            return "Teen";
        } else {
            return "Minor";
        }
    }

}

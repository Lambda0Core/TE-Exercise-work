package com.techelevator;

import java.nio.charset.StandardCharsets;

public  class TwoCharacters {

        /*
	 Given a string and an index, return a string length 2 starting at the given index.
	 If the index is  too big or too small to define a string length 2,
	    use the first 2 chars.
	 The string length will be at least 2.

	 twoChar("java", 0) → "ja"
	 twoChar("java", 2) → "va"
	 twoChar("java", 3) → "ja"

	 diagram a solution?
     */
        public static void main(String[] args) {
        twoChar("java", 0);
        twoChar("java", 2);
        twoChar("java", 3);
        twoChar("java", 4);
        twoChar("java", -1);
        twoChar("Hello", 0);
        twoChar("Hello", 1);
        twoChar("Hello", 99);
        twoChar("Hello", 3);
        twoChar("Hello", 4);
        twoChar("Hello", 5);
        twoChar("Hello", -7);
        twoChar("Hello", 6);
        twoChar("Hello", -1);
        twoChar("yay", 0);
        twoChar("TE", 0);
        twoChar("TE", 2);
        twoChar("TE", 3);

                twoChar("", 3);
        }


    public static String twoChar(String str, int index) {

                if (str.length() < 2){
                        System.out.println("string: " + str + " index: " + index + " result: "+  str);
                        return str;
                }
                if (index < 0 || index + 2 > str.length()){
                       index = 0;
                }
            System.out.println( "string:: " + str + " index: " + index + " result: "+  str.substring(index, index + 2));
            return "";
    }
}

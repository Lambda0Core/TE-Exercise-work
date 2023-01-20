package com.techelevator;

public class InClassModDemo {

    public static void main(String[] args) {

        int[] arrayToLoopThrough = { 4, 3, 4, 1, 4, 6, 4, 3, 4, 1, 4, 6,9,8 };

        //     Start;       Keep going while       Increment by;
//        for (int i = 0; i < arrayToLoopThrough.length; i++) {
//            if (i % 3 == 2) {
//                System.out.println(arrayToLoopThrough[i]);
//            }
//        }
        int i = 0;
        while ( i < arrayToLoopThrough.length){

            if (i % 3 == 0){
                System.out.print(arrayToLoopThrough[i] + ", ");
            }
            if (i % 3 == 1){
                System.out.print(arrayToLoopThrough[i] + ", ");
            }
            if (i % 3 == 2){
                System.out.print(arrayToLoopThrough[i] + "\n");
            }
            i++;
        }

//                4, 3, 4
//                1, 4, 6
//                4, 3, 4
//                1, 4, 6

    }
}

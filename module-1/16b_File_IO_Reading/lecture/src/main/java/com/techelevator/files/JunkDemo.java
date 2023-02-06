package com.techelevator.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JunkDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //open the file
        //read a line
        //print a line
        //read the next line
        //print the next line

        File inputFile = new File("rtn.txt");


        if (inputFile.exists()){
            System.out.println(inputFile.getName() + " exists");

            try (Scanner scanner = new Scanner(inputFile)){
                while(scanner.hasNextLine()){
                    String lineFromFile = scanner.nextLine();
                    String[] words = lineFromFile.split(" ");
                    int[] numbers = new int [Integer.parseInt(String.valueOf(words))];
                    for(int word : numbers){
                        System.out.println(word);
                    }
//                  System.out.println(lineFromFile);

                }
            }
        }else {
            System.out.println("File not found.");
        }
    }
}

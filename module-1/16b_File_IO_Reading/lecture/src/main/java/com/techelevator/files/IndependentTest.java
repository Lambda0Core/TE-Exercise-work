package com.techelevator.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IndependentTest {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("rtn.txt");

        try (Scanner scanner = new Scanner(inputFile)){
            while(scanner.hasNextLine()){
                String lineFromFile = scanner.nextLine();
                String[] arrayTest = lineFromFile.split(" ");
                for(String num : arrayTest){
                    System.out.println(num);
                }
            }

        }

    }
}

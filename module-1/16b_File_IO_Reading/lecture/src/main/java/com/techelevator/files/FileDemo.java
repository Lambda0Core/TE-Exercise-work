package com.techelevator.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //open the file
        //read a line
        //print a line
        //read the next line
        //print the next line

        File inputFile = new File("src/main/java/com/techelevator/files/test-file.txt");


        if (inputFile.exists()){
            System.out.println(inputFile.getName() + " exists");

            try (Scanner scanner = new Scanner(inputFile)){
              while(scanner.hasNextLine()){
                  String lineFromFile = scanner.nextLine();
                  String[] words = lineFromFile.split(" ");
                  for(String word : words){
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

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

        File inputFile = new File("C:\\Users\\Student\\workspace\\classroom\\module-1\\16b_File_IO_Reading\\lecture\\src\\main\\java\\com\\techelevator\\files\\test-file.txt");

        if (inputFile.exists()){
            System.out.println("rtn.txt exists");

            try (Scanner scanner = new Scanner(inputFile)){
                while(scanner.hasNextLine()){
                    String lineFromFile = scanner.nextLine();
                    String[] words = lineFromFile.split("");
                    for(String word : words){
                        System.out.println(word);
                    }
                    //System.out.println(lineFromFile);

                }
            }

        } else {
            System.out.println("file not found");
        }
    }
}

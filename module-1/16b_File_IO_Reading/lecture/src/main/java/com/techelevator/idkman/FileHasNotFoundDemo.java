package com.techelevator.idkman;

import java.io.File;
import java.io.FileNotFoundException;

public class FileHasNotFoundDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File inputFile = new File("src/main/java/com/techelevator/files/test-file.txt");

            if (!inputFile.exists()) {
                throw new FileNotFoundException(inputFile.getName() + " was not found at " + inputFile.getPath());
            }else {
                System.out.println(inputFile.getName() + " was found at " + "'" + inputFile.getPath() + "'");
            }


        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}

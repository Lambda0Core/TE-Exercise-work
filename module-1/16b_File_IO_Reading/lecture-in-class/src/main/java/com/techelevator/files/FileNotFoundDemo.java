package com.techelevator.files;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundDemo {
    public static void main(String[] args) {


        try {
            File inputFile = new File("C:\\xUsers\\Student\\workspace\\classroom\\module-1\\16b_File_IO_Reading\\lecture\\src\\main\\java\\com\\techelevator\\files\\test-file.txt");

            if (!inputFile.exists()) {
                throw new FileNotFoundException(inputFile.getName() + " was not found at " + inputFile.getPath());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

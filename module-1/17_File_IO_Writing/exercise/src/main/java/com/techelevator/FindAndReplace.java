package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        // Read all information from the user
        System.out.println("What is the search word?");
        String search = userInput.nextLine();
        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();
        System.out.println("What is the source file?");
        String source = userInput.nextLine();
        System.out.println("What is the destination file?");
        String destination = userInput.nextLine();
        userInput.close();
        try {
            // create FileWriter object
            FileWriter fileOut = new FileWriter(destination);
            // create BufferedWriter object
            BufferedWriter bw = new BufferedWriter(fileOut);

            // create scanner object
            Scanner fileRead = new Scanner(new File(source));
            // check next line present or not
            while (fileRead.hasNextLine()) {
                // read each line
                String data = fileRead.nextLine();
                // write data to the destination file
                bw.write(data.replace(search, replacementWord));
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fileRead.close();
            System.out.println("Data replaced successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}


package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {



		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */


		/**
		 * REQUIREMENTS
		 * Read test.txt
		 * for each line
		 *      reverse the line
		 *      print the line to a new file called results.txt
		 * close the program
		 */

		// get the input file
		File inputFile = new File("test.txt");

		if (!inputFile.exists()){
			System.out.println("File not found.");
			throw new FileNotFoundException("test.txt does not exist!");

		}

		//get or create the destination file
		File destinationFile = new File("results.txt");
		if (!destinationFile.exists()){
			destinationFile.createNewFile();

		}

		//create the file scanner
		try (Scanner fileScanner = new Scanner(inputFile)){
			while (fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				line = line.replace("dolorem", "magic");
					line = reverseString(line);

				writeToDestinationFile(destinationFile, line);


			}


		}
	}

	private static String reverseString(String line) {
		String reversedString = "";

		for (int i = 0; i < line.length(); i++) {
			reversedString = line.charAt(i) + reversedString;

		}

		return reversedString;
	}

	//write to the destination file
	private static void writeToDestinationFile(File destinationFile, String nextLine) throws FileNotFoundException {
           try(PrintWriter writer = new PrintWriter(new FileOutputStream(destinationFile, true))){
			   writer.append(nextLine + "\n");
		   }catch( FileNotFoundException ex){

		   }
	}
}

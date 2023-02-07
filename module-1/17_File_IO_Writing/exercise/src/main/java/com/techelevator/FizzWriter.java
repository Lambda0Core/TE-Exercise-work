package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.run();
	}

	public void run() {
		//Create file in /test/resources dir
		File f = new File("src/test/resources/FizzBuzz.txt");
		//print fizz buzz in the new file
		try (PrintWriter writer = new PrintWriter(f)) {
			for (int i = 1; i <= 300; i++) {
				String output = "";

				if (i % 3 == 0) output += "Fizz";
				if (i % 5 == 0) output += "Buzz";

				writer.println((!output.isEmpty()) ? output : output.valueOf(i));

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//Finished code. Test really does not like it for some reason...

package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();
	}

	public void run() throws FileNotFoundException {
		//file selection
		boolean capsLock = false;
		String result = "";
		try (userInput) {
			System.out.println("What is the fully qualified name of the file that should be searched?");
			String path = userInput.nextLine();
			File inputFile = new File(path);
			if (!inputFile.exists()) {
				System.out.println("File does not exist");
				System.exit(1);
			}
			if (!inputFile.isFile()) {
				System.out.println("Unknown File Type, could not be read.");
				System.exit(2);
			}
			//word selection
			System.out.println("What word are you searching for?");
			String wordSearch = userInput.nextLine();
//			//caps sensitivity
			System.out.println("Caps-Sensitive? Y/N");
			String capsAns = userInput.nextLine();
			String wordSearchUpper = "";
			if ((capsAns.toUpperCase()).equals("Y")) {
				capsLock = true;
			} else if ((capsAns.toUpperCase()).equals("N")) {
				wordSearch = wordSearch.toLowerCase();
				capsLock = false;
			}


			//reading file line
			System.out.println("Reading file, please wait warmly...");
			Scanner scanner = new Scanner(inputFile);
			int lineCount = 0;

			while (scanner.hasNextLine()){
				lineCount++;
				String lineFromFile = scanner.nextLine();
				String[] words = lineFromFile.split(" ");
				for (String num : words) {
					if (num.contains(wordSearch)) {
						result = num;
						System.out.println(lineCount + ") " + lineFromFile);
					} else if (num.equalsIgnoreCase(wordSearch) && capsLock == false) {
						result = num;
						System.out.println(lineCount + ") " + lineFromFile);
					}
				}
			}
		}catch (Exception ex){
			System.out.println("Whoops! I tripped whilst preparing your list, I sincerely apologize but would you please run that by me again?");
		}
	}

}



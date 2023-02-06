package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class QuizMaker {


	public static void main(String[] args) throws FileNotFoundException {
		 Scanner userInput = new Scanner(System.in);
		//file selection
		boolean capsLock = false;
		String result = "";
		try (userInput) {
			System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
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
			//reading file line
			System.out.println("Girls are preparing questions, please wait warmly...");

			Scanner scanner = new Scanner(inputFile);
			ArrayList<String> Qna = new ArrayList<String>();
			while (scanner.hasNextLine()){
				String lineFromFile = scanner.nextLine();
				String[] answers = lineFromFile.split("\\|");

				for (int i = 0; i < Qna.size(); i++) {
					Qna.add(answers[i]);
					System.out.println(Qna);
				}

//					} else if (num.equalsIgnoreCase(wordSearch) && capsLock == false) {
//						result = num;
//						System.out.println(lineCount + ") " + lineFromFile);
//					}
				}
		}catch (Exception ex){
		}
			System.out.println("ERROR");
		}
	}




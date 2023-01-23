package com.techelevator;
import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Temperature Converter");
        String str1 = "C";
		String str2 = "F";
		System.out.print("Are you entering the temp in (F)ahrenheit or (C)elsius?: ");
		String fOrC = scanner.nextLine();
		if (fOrC.equals(str2)){
			System.out.print("Enter the temperature in Fahrenheit: ");
			String fConv = scanner.nextLine();
			double temperatureFarenheit = Double.parseDouble(fConv);
			double temperatureCelsius = (temperatureFarenheit - 32) / 1.8;
			System.out.println("Temperature is... " + temperatureFarenheit + "F" + " in Fahrenheit " + temperatureCelsius + "C" + " in Celsius");
		}
		if (fOrC.equals(str1)){
			System.out.print("Enter the temperature in Celsius: ");
			String cConv = scanner.nextLine();
			double temperatureCelsius = Double.parseDouble(cConv);
			double temperatureFarenheit = temperatureCelsius * 1.8 + 32;
			System.out.println("Temperature is... " + temperatureCelsius + "C" + " in Celsius " + temperatureFarenheit + "F" + " in Fahrenheit");
		}else{
			System.out.println("Error! Must enter either (F) or (C) UPPER CASE.");
		}



	}

}

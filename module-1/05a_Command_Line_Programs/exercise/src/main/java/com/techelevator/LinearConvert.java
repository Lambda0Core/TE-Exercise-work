package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Linear Converter");
		String str1 = "m";
		String str2 = "f";
		System.out.print("Are you entering the length in (m)eters or (f)eet?: ");
		String mOrF = scanner.nextLine();
		if (mOrF.equals(str1)){
			System.out.print("Enter the length in meters: ");
			String mConv = scanner.nextLine();
			double metersC = Double.parseDouble(mConv);
			double feetC = metersC * 0.3048;
			int metersI = (int)metersC;
			int feetI = (int)feetC;
			System.out.println(metersI+"m" + " is " + feetI + "f");
		}
		if (mOrF.equals(str2)){
			System.out.print("Enter the length in feet: ");
			String fConv = scanner.nextLine();
			double metersC = Double.parseDouble(fConv);
			double feetC = metersC * 3.2808399;
			int metersI = (int)metersC;
			int feetI = (int)feetC;
			System.out.println(feetI+"f" + " is " + metersI + "m");
		}else{
			System.out.println("Error! Must enter either (m) or (f) in all lower case.");
		}



	}

}

package com.techelevator;

public class DecimalToBinary {

	//	Write a command-line program which prompts the user for a series of decimal integer values separated by spaces.
	//	Display each decimal integer along with its equivalent binary value.
	//
	//	Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
	//
	//			460 in binary is 111001100
	//			8218 in binary is 10000000011010
	//			1 in binary is 1
	//			31313 in binary is 111101001010001
	//			987654321 in binary is 111010110111100110100010110001
	//

	public static void main(String[] args) {

		ConvertDecimalToBinary(9);
		ConvertDecimalToBinary(32);
		ConvertDecimalToBinary(128);
		ConvertBinaryToDecimal();
	}

	private static void ConvertDecimalToBinary(int decimalNumber) {
		String result = "";
		int currentValue = decimalNumber;
		int remainder = 0;

		while( currentValue > 0  ) {
			remainder = currentValue % 2;
			currentValue = currentValue / 2;

			result = Integer.valueOf(remainder).toString() + result;

//			if ( currentValue / 2 == 0 && currentValue % 2 == 1){
//					result = "1" + result;
//			}
		}

		System.out.println(result);
	}
	private static void ConvertBinaryToDecimal() {

	}
}

package com.master.jakhar.general;

/** This class will convert Decimal Number to Binary form. */
public final class DecimalToBinary {
	private DecimalToBinary(int number) {
		convertToBinary(number);
	}

	/** Logic to convert Decimal to Binary. 
	* Divide number by 2 until we get to 0 as the remainder. E.g. 11 in
	* binary form will be 1101. 
	* 11 / 2 = Dividend is 5 and remainder is 1 after 2*5 + 1. 
	* 5 / 2 = Dividend is 2 and remainder is 1 after 2*2 + 1. 
	* 2 / 2 = Dividend is 1 and remainder is 0 after 2*1 + 0. 
	* 1 / 2 = Dividend is 0 and remainder is 1. 
	* So the Binary representation of 11 is 1011.
	* Which is (2^3)*1 + (2^2)*0 + (2^1)*1 + (2^0)*1 
	* Solved as: 8 + 0 + 2 + 1 = 11.
	*/
	public static String convertToBinary(int number) {
		
		/**Do not work on original number passed.*/
		int num = number;
		
		/**String to hold Binary representation of the number.*/
		String binary = "";

		/**
		 * In any case if the incoming number format is not of the type it 
		 * should be then throw an exception and let the client to know about it.
		 */
		try {
			while (num > 0) {
				int remainder = num % 2;
				num = num / 2;
				binary = remainder + binary;
			}
		} catch (NumberFormatException numberFormatException) {
			throw new NumberFormatException();
		}

		System.out.printf("Binary representation of %d is %s.", number,
				binary.toString());
		System.out.println();
		return binary;
	}
}
package main;

import java.lang.reflect.Array;

public class Arrays {

	public static void int10Array() {
		int[] int10Array = new int[10];

		for (int i = 0; i < Array.getLength(int10Array); i++) {
			int10Array[i] = i;
		}

		for (int i : int10Array) {
			System.out.println(i);
		}

	}

	public static void multArray() {
		int[] int10Array = new int[10];

		for (int i = 0; i < Array.getLength(int10Array); i++) {
			int10Array[i] = i;
			System.out.println(int10Array[i]);

		}

		for (int i = 0; i < Array.getLength(int10Array); i++) {
			int10Array[i] = int10Array[i] * 10;
			System.out.println(int10Array[i]);

		}

	}

	public static void digitAdd(int digits) {

		System.out.println((digits / 10) + (digits % 10));

	}

	public static String numToString(int num) {
		String returnString = "";

		// Returns thousand to the string
		if (digit(num, 4) > 0) {
			returnString += intToString(digit(num, 4)) + " thousand ";
		}

		// Returns hundreds to the string
		if (digit(num, 3) > 0) {
			returnString += intToString(digit(num, 3)) + " hundred ";
		}

		if (!returnString.equals("")) {
			returnString += "and ";
		}

		if ((digit(num, 2) == 1)) {
			returnString += intToStringTeens(digit(num, 1));
		}

		else {
			if ((digit(num, 2) > 0)) {
				returnString += intToStringTens(digit(num, 2));

				if ((digit(num, 1) > 0)) {
					returnString += "-" + intToString(digit(num, 1));
				}
			} else {
				if ((digit(num, 1) > 0)) {
					returnString += intToString(digit(num, 1));
				}
			}
		}

		return returnString;

	}

	private static int digit(int a, int b) {
		return a / (int) Math.pow(10, b - 1) % 10;
	}

	private static String intToString(int a) {
		switch (a) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";

		}
		return null;
	}

	private static String intToStringTeens(int a) {
		switch (a) {
		case 0:
			return "ten";
		case 1:
			return "eleven";
		case 2:
			return "twelve";
		case 3:
			return "thirteen";
		case 4:
			return "fourteen";
		case 5:
			return "fifteen";
		case 6:
			return "sixteen";
		case 7:
			return "seventeen";
		case 8:
			return "eighteen";
		case 9:
			return "nineteen";

		}
		return null;
	}

	private static String intToStringTens(int a) {
		switch (a) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "fourty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninty";

		}
		return null;
	}
}

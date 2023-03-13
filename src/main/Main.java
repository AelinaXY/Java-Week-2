package main;

import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print10();

		changeCalculator(20d, 4.58d);

	}

	public static void print10() {
		for (int i = 1; i <= 10; i++) {

			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}

	public static void changeCalculator(double payment, double cost) {

		int changeDesired = (int) ((payment - cost) * 100);

		LinkedHashMap<String, int[]> currency = new LinkedHashMap<String, int[]>();

		// Currency stored as pence rather than pounds to avoid issues arising due to
		// floating point numbers
		currency.put("£10 Note(s)", new int[] { 1000, 0 });
		currency.put("£5 Note(s)", new int[] { 500, 0 });
		currency.put("£1 Coin(s)", new int[] { 100, 0 });
		currency.put("50p Coin(s)", new int[] { 50, 0 });
		currency.put("20p Coin(s)", new int[] { 20, 0 });
		currency.put("10p Coin(s)", new int[] { 10, 0 });
		currency.put("5p Coin(s)", new int[] { 5, 0 });
		currency.put("2p Coin(s)", new int[] { 2, 0 });
		currency.put("1p Coin(s)", new int[] { 1, 0 });

//		System.out.println(currency.toString());

		System.out.println("Change Needed: £" + changeDesired / 100f);

		for (String i : currency.keySet()) {
			while (changeDesired - currency.get(i)[0] >= 0) {
				changeDesired -= currency.get(i)[0];
				currency.get(i)[1]++;
//				changeDesired = Math.round(changeDesired);
			}
//			System.out.println(i + ": " + changeDesired / 100f);
			if (currency.get(i)[1] > 0) {
				System.out.println("Number of " + i + " : " + currency.get(i)[1]);
			}

		}

	}

}

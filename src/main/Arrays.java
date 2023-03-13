package main;

import java.lang.reflect.Array;

public class Arrays {
//	    Create an array that will hold 10 integer values, 
//	populate the array with values, then call and output each element.
//	        Create a for loop that populates an integer array with values, outputting them at each iteration.
//	            AuthenticationException create another loop that iteratet imes 10, outputting them at each iteration.

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

}

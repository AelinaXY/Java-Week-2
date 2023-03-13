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
}

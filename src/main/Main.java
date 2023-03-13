package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print10();

	}

	public static void print10() {
		for (int i = 1; i <= 10; i++) {

			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}

}

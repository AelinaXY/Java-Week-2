package week2;

public class stringMethods {

	public static int wordCount(String input) {

		int count = 0;
		if (!input.isEmpty())
			count++;

		for (char i : input.toCharArray()) {
			if (i == ' ') {
				count++;
			}

		}
		return count;
	}

}

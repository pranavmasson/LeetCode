package files;

import java.lang.reflect.Array;

public class plusOne {

	public static void main(String[] args) {
		int digits[] = {1};
		int result[] = plusOne(digits);
		for (int i = 0; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] plusOne(int[] digits) {
		int newDigits[] = new int[digits.length + 1];
		for (int i = 1; i < newDigits.length; i++) {
			newDigits[i] = digits[i - 1];
		}
		for (int i = newDigits.length-1; i > 0; i--) {
			if (i == newDigits.length-1) {
				if (newDigits[i] == 9) {
					newDigits[i] = 0;
					newDigits[i - 1] += 1;
				} else {
					newDigits[i] += 1;
				}
			} else if (newDigits[i] == 10) {
				newDigits[i] = 0;
				newDigits[i - 1] += 1;
			}
		}
		if (newDigits[0] == 0) {
			for (int i = 1; i < newDigits.length; i++) {
				digits[i -1] = newDigits[i];
			}
			return digits;
		}
		return newDigits;
	}

}

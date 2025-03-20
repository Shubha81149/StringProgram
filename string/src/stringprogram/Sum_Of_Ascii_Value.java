package stringprogram;

import java.util.Scanner;

public class Sum_Of_Ascii_Value {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String s = sc.next();
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			sum += s.charAt(i);
			System.out.print((int) s.charAt(i));

			if (i < s.length() - 1)
				System.out.print(" + ");
		}
		System.out.print(" = "+sum);
	}

}

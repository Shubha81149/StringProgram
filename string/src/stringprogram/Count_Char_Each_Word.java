package stringprogram;

import java.util.Scanner;

public class Count_Char_Each_Word {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String s = sc.nextLine();
		int count = 0;
		s += " ";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {

				count++;
			} else {
				System.out.println(s.substring(i - count, i) + " = " + count);
				count = 0;
			}
		}

	}

}

package stringprogram;

import java.util.Scanner;

public class ReverseFirstHalfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		char[] a = s.toCharArray();
		int n = a.length / 2;

		for (int j = n - 1; j >= 0; j--) {
			System.out.print(a[j]);
		}
		for (int j = n; j < a.length; j++) {
			System.out.print(a[j]);

		}

	}

}

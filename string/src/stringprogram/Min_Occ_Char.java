package stringprogram;

import java.util.Scanner;

public class Min_Occ_Char {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char[] a = s.toCharArray();

		int mincount = Integer.MAX_VALUE;
		char ele = a[0];

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count < mincount) {
				mincount = count;
				ele = a[i];
			}

		}
		System.out.println("Max Occurance is: "+ele+" - "+mincount);
	}

}

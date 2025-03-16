package stringprogram;

import java.util.Scanner;

public class Print_Char_More_Than_One {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char[] a = s.toCharArray();

		boolean[] bool = new boolean[256];

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			
			if(bool[a[i]]) {
				continue;
			}
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("More Than Once are: " + a[i] + " - " + count);
			    bool[a[i]] = true;
			}
		}
	}

}

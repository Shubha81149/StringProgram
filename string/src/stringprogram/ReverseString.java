package stringprogram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		for (int i = s.length()-1; i >= 0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch);
		}
	}

}

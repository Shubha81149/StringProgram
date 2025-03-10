package stringprogram;

import java.util.Scanner;

public class Reverse_A_Sentence {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		
		String s1 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			s1+=ch;
		}
		System.out.println(s1);
		
	}

}

package stringprogram;

import java.util.Scanner;

public class ConvertAll_Vowel_Attherate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				
				s1 += '@';
			}
			else {
				s1+=ch;
			}
		}
		System.out.println("The Converted String is: "+s1);

	}

}

package stringprogram;

import java.util.Scanner;

public class String_To_Char_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char[] a = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			
			 a[i] = s.charAt(i);
		}
        for(char c:a) {
        	System.out.print(c);
        }
	}

}

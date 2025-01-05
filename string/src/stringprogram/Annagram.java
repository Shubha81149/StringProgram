package stringprogram;

import java.util.Scanner;

public class Annagram {

	static boolean isAnnagram(String s1, String s2) {
		
		while(true) {
			
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0 && s2.length()==0) return true;
			 
			char c = s1.charAt(0);
			s1 = s1.replace(c+"", "");
			
			s2 = s2.replace(c+"", "");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1 :");
		String s1 = sc.next();
		System.out.println("Enter a String2 :");
		String s2 = sc.next();
		
		if(isAnnagram(s1,s2)) System.out.println("It is a Annagram");
		else System.out.println("It is not a Annagram");
	}

}

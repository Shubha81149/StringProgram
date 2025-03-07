package stringprogram;

import java.util.Scanner;

public class ConsonantPrint {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		
		for(int i = 0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
			   ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'	&& ch != 'U'){
				
				if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
					
					System.out.println("Consonant's are: "+ch);
				}
			}
		}
		
	}

}

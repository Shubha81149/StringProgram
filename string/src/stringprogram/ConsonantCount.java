package stringprogram;

import java.util.Scanner;

public class ConsonantCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int count = 0;
		
		for(int i = 0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
			   ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'	&& ch != 'U'){
				
				if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
					
					count++;
				}
			}
		}
		System.out.println("Consonant Count is: "+count);

	}

}

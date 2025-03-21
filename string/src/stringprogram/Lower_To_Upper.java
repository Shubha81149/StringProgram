package stringprogram;

import java.util.Scanner;

public class Lower_To_Upper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String s = sc.next();
		char[] a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>='a' && a[i]<='z') {
				a[i] = (char)(a[i]-32);
			}
		}
		String upper = new String(a);
		System.out.println("The Upper Case is: "+upper);

	}

}

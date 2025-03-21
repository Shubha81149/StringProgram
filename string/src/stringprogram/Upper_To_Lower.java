package stringprogram;

import java.util.Scanner;

public class Upper_To_Lower {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String s = sc.next();
		char[] a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] >='A' && a[i] <='Z') {
				a[i] = (char)(a[i]+32);
			}
		}
		String lower = new String(a);
		System.out.println("The Lower Case is: "+lower);
	}

}

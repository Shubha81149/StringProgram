package stringprogram;

import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 = sc.next();
		System.out.println("Enter a Encoding level :");
		int e = sc.nextInt();
		
		char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] a = s1.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			char ch = a[i];
			int index = ch-97;
			index = (index+e)%26;
			a[i] = alpha[index];
		}
		String s2 = new String(a);
		System.out.println("Encoding is :"+s2);
	}

}

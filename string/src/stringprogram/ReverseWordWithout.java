package stringprogram;

import java.util.Scanner;

public class ReverseWordWithout {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		String[] a = s.split(" ");
		String s1 = "";
		
		for(int i=a.length-1;i>=0;i--) {
			
			s1 += a[i]+" ";
			
		}
		String s2 = s1.trim();
		System.out.println(s2);
		
	}
	
}

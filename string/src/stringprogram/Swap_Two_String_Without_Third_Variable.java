package stringprogram;

import java.util.Scanner;

public class Swap_Two_String_Without_Third_Variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String a = sc.next();
		String b = sc.next();
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swaping: "+a+", "+b);

	}

}

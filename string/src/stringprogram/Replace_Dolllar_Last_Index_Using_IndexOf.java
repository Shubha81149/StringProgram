package stringprogram;

import java.util.Scanner;

public class Replace_Dolllar_Last_Index_Using_IndexOf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String s = sc.next();
		char[] ch = s.toCharArray();
		int index = s.indexOf('s');
		
		while(index != -1) {
			ch[index] = '$';
			index = s.indexOf('s', index+1);
			
		}
		System.out.println(new String(ch));

	}

}

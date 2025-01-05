package stringprogram;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		int wc =0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				wc++;
			}
		}
		System.out.println("Word count in a String :"+(wc+1));
	}

}

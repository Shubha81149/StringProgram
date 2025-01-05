package stringprogram;
import java.util.Scanner;
public class RepeatedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		int i=0;
		//char ch;
		while(i<a.length) {
			String str = a[i]+" ";
			char ch = a[i];
			i++;
			while(i<a.length && a[i]==ch) {
				str+=ch;
				i++;
				
				if(str.length()>1) 
				    System.out.println("Reapeted char is :"+str);
				
			}
			
		}
	}

}

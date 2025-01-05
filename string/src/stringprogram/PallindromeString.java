package stringprogram;
import java.util.Scanner;
public class PallindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.next();
        if(isPallindrome(s)) {
           System.out.println("Pallindrome String");
        }
        else {
        	System.out.println("Not a Pallindrome String");
        }
       
	}
	public static boolean isPallindrome(String s) {
		s = s.toLowerCase();
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!= s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}

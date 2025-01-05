package stringprogram;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String :");
         String s = sc.next();
         char[] a = s.toCharArray();
         int sum =0;
         for(char ch:a) {
        	 if(ch>='0' && ch<='9') {
        		 sum+=ch-'0';
        	 }
         }
         System.out.println("Sum of number in a given String :"+sum);
	}

}

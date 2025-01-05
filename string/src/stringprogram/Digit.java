package stringprogram;
import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a String :");
     String s = sc.next(); 
     char[] a = s.toCharArray();
     String s1 = "";
     int count =0;
     for(char ch:a) {
    	 if(ch>='0' && ch<='9') {
    	   s1+=ch;
    	   count++;
    	 }
     }
     System.out.println("Number is :"+s1);
     System.out.println("Number is :"+count);
	}   
}

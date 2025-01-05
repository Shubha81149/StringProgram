package stringprogram;
import java.util.Scanner;
public class EachCharCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1 = sc.next();
        String s2 = "";
        while(s1.length()>0) {
        	 char ch = s1.charAt(0);
             s2 = s1.replace(ch+"","");
             int n = s1.length()-s2.length();
             System.out.println(ch+"="+n);
             s1=s2;
        }
	}

}

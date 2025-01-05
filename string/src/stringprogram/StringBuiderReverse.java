package stringprogram;
import java.util.Scanner;
public class StringBuiderReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
        	char ch = s.charAt(i);
        	sb.append(ch);
        }
        String s2 = sb.toString();
        System.out.println(s2);
	}

}

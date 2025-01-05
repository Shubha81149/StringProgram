package stringprogram;
import java.util.Scanner;
public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
        String s = sc.nextLine();
        String s1 = "";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') continue;
        	s1+=s.charAt(i);
        }
        System.out.println("String is :"+s1);
	}

}

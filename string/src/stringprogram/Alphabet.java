package stringprogram;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.next();
        String s1 ="";
        for(int i=0;i<s.length();i++)
        {
        	char ch = s.charAt(i);
        	if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        	{
        		s1+=ch;
        	}
        }
        System.out.println("AlphaBet is :"+s1);
	}

}

package stringprogram;
import java.util.Scanner;
public class Vowelcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
        String s = sc.next();
        int vc =0;
        for(int i=0;i<=s.length()-1;i++)
        {
        	char ch = s.charAt(i);
        	if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| 
        	   ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') 
        	{
        		vc++;	
        	}
        }
        System.out.println("Vowel count is :"+vc);
	}

}

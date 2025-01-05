package stringprogram;

import java.util.Scanner;

public class Alphacount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.next();
        int alphacount =0;
        for(int i=0;i<s.length();i++)
        {
        	char ch = s.charAt(i);
        	if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        	{
        		alphacount++;
        	}
        }
        System.out.println("Alphacount is :"+alphacount);
	}

}

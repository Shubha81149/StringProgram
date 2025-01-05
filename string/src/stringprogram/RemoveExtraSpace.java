package stringprogram;
import java.util.Scanner;
public class RemoveExtraSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
        	{   
        		continue;
        	}
        	sb.append(s.charAt(i));
        }
        String s2 = sb.toString();
        System.out.println(s2);
	}

}

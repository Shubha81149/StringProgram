package regex.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOf_Group_Number_String {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int sum = 0;
		
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(s);
		
		while(m.find()) {
			
			sum+=Integer.parseInt(m.group());
		}
		System.out.println("The Sum is: "+sum);
	}

}

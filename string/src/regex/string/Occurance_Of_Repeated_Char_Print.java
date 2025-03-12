package regex.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurance_Of_Repeated_Char_Print {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		String regex = "([a-zA-Z])\\1*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		String res = "";
		
		while (m.find()) {

			String s1 = m.group();
			res = res+s1.length()+s1.charAt(0);  
		}
		System.out.println(res);

	}

}

package regex.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$&_-]).{5,10}";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		
		if(m.matches()) {
			System.out.println("Password Validation");
		}else {
			System.out.println("Enter valid Password");
		}
		
	}

}

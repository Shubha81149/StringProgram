package regex.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber_Validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String regex = "[6-9][0-9]{9}";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		
		if(m.matches()) {
			System.out.println("It is a Valid Ph Number");
		}else {
			System.out.println("Enter valid Ph Number");
		}

	}

}

package stringprogram;
import java.util.Scanner;
public class Alphanumeric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		String lc = "";
		String uc = "";
		String nc = "";
		String sce = "";
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				lc+=ch;
			}else if(ch>='A' && ch<='Z') {
				uc+=ch;
			}else if(ch>='0' && ch<='9') {
				nc+=ch;
			}else {
				sce+=ch;
			}	
		}
		System.out.println("String is :"+lc+uc+nc+sce);

	}

}

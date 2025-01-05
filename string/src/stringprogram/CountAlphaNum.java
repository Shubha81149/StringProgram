package stringprogram;
import java.util.Scanner;
public class CountAlphaNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		int lc = 0;
		int uc = 0;
		int nc = 0;
		int sce = 0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				lc++;
			}else if(ch>='A' && ch<='Z') {
				uc++;
			}else if(ch>='0' && ch<='9') {
				nc++;
			}else {
				sce++;
			}	
		}
		System.out.print("lowerCase is :"+lc+"\n"+"Upercase is :"+uc+"\n"+
		"Numbeer is :"+nc+"\n"+"Special is :"+sce);
	}

}


package stringprogram;
import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char[] a = s.toCharArray();
		int sum=0;
		int i=0;
		while(i<a.length) {
			int n=0;
			while(i<a.length && a[i]>='0' && a[i]<='9') {
				n = (n*10)+a[i]-'0';
				i++;
			}
			sum+=n;
			i++;
		}
		System.out.println("Sum of DIgit is :"+sum);
	}

}

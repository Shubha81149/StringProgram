package stringprogram;
import java.util.Scanner;
public class TitleCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1 = sc.nextLine();
        String[] a = s1.split(" ");
        String s2 = titleCase(a[0]);
        
        for(int i=1;i<a.length;i++) {
        	s2 +=" "+titleCase(a[i]);
        }
        System.out.println("TitleCase is :"+s2);
	}
	static String titleCase(String s) {
		return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
		
	}

}

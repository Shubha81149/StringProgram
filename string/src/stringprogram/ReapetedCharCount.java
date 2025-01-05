package stringprogram;
import java.util.Scanner;
public class ReapetedCharCount {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        String str =" ";
        int i=0;
        while(i<a.length) {
        	char ch = a[i];
        	int count =1;
        	i++;
        	while(i<a.length && a[i]==ch) {
        		count++;
        		i++;
        	}
        	if(count==1) str+=ch;
        	else str=str+count+ch;
        }
        System.out.println("Reapeted char count is :"+str);
	}

}

package stringprogram;
import java.util.Scanner;
public class SubStringPallindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1 = sc.next();
        int count =0;
        for(int i=0;i<s1.length()-1;i++) {
        	for(int j=i+1;j<s1.length();j++) {
        		if(isPallindrome(s1, i, j)) {
        			//System.out.println(s1.substring(i,j+1));
        			count++;
        		}
        	}
        }
        System.out.println(count);
	}
    public static boolean isPallindrome(String s,int st,int end) {
    	int i = st;
    	int j = end;
    	while(i<j) {
    		if(s.charAt(i)!=s.charAt(j)) {
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
    }
}

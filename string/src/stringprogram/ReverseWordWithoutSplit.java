package stringprogram;

import java.util.Scanner;

public class ReverseWordWithoutSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 = sc.nextLine();
	    char[] a = s1.toCharArray();
	    String s2 = "";
	    int i = 0;
	    int j = 0;
	    
	    while(i<a.length) {
	    	while(j<a.length && a[j]!=' ') {
	    		j++;
	    	}
	    	int k=j-1;
	    	String temp ="";
	    	while(k>=i) {
	    		temp+=a[k];
	    		k--;
	    	}
	    	s2+=temp;
	    	if(j<a.length) s2+=" ";
	        j++;
	        i=j;
	    }
	    System.out.println("Reverse Word in a String :"+s2);
	}

}

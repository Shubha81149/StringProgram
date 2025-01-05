package stringprogram;

public class Permutation {

	static String swap(String s,int i, int j) {
		
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return new String(a);
		
	}
	static void permutation(String s,int st,int end) {
		
		if(st==end) {
			System.out.println(s);
			return ;
		}
		for(int i=st;i<end;i++) {
			String s1 = swap(s,st,i);
			permutation(s1, st+1, end);
		}
	}
	public static void main(String[] args) {
		
		permutation("abc", 0, 3);
	}

} 

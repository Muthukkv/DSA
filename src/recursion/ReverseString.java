package recursion;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String a,String b, int i) {
		if(i<0) {
			return b;
		}		
		return reverse(a,b+a.charAt(i),i-1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		System.out.println(reverse(n,"",n.length()-1));
		s.close();
	}
}

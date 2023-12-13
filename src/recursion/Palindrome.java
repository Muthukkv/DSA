package recursion;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String n,int i,int j) {
		if(n.charAt(i)!=n.charAt(j)) {
			return false;
		}
		if(i>=0) {
			return true;
		}

		return isPalindrome(n,i++,j--);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		System.out.println(isPalindrome(n,0,n.length()-1));
		s.close();
	}
}

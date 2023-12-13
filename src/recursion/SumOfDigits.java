package recursion;

import java.util.Scanner;

public class SumOfDigits {
	static int sum(int n) {
		if(n==0) {
			return 0;
		}	
		return sum(n/10)+n%10;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sum(n));
		s.close();
	}
}

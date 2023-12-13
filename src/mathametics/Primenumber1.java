package mathametics;

import java.util.Scanner;

public class Primenumber1 {
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
//		System.out.println(isPrime(n));
		s.close();
		
		for(int i = 1;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}
	}

}

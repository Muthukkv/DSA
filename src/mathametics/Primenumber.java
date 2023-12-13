package mathametics;

import java.util.Scanner;

public class Primenumber {
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0 || n%3==0) {
			return false;
		}
		for(int i =5;i<=Math.sqrt(n);i+=6) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		System.out.println(isPrime(n));
		s.close();
	}

}

package mathametics;

import java.util.Scanner;

public class PrimeFactors {

	public static void primeFactor(int n) {
		int i = 2;

		while(Math.sqrt(n)>1) {

			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
		if(n>1) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		primeFactor(n);
		s.close();
	}
}

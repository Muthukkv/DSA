package mathametics;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	static long sumOfNatural(int n) {
		
		long sum = (long) n*(n+1)/2;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter number to find Sum");
		int n = s.nextInt();
		System.out.println(sumOfNatural(n));
		s.close();
	}

}

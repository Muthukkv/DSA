package bitoperatiors;

import java.util.Scanner;

public class RightMostSet {
	public static int rightSet(int n) {
		int ans =  n^(n&(n-1));
		return (int)(Math.log10(ans)/Math.log10(2)) +1;
		
	//	return (int)(Math.log10(n^(n&(n-1)))/Math.log10(2)) +1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = s.nextInt();
		System.out.println(rightSet(n));
		s.close();
	}
}

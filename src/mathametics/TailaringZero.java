package mathametics;

import java.util.Scanner;

public class TailaringZero {

	// no of 5 = tailoring zero
	// series of powerOf5 5/5,5/25,5/125,5/625.....
	//numerator>denominator

	static int findZero(int n) {

		int res = 0;		
		int powerOf5 = 5;

		while(n>=powerOf5) {
			res = res+(n/powerOf5);
			powerOf5 = powerOf5*5;
		}		
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n= s.nextInt();
		System.out.println(findZero(n));
		s.close();
	}

}

package mathametics;

import java.util.Scanner;

public class Factorial {

	static int factNumber(int n) {
		//Least factorial number is 1;
		int res = 1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter factorial number");
		int n = s.nextInt();
		System.out.println(factNumber(n));
		s.close();
	}
}

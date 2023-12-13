package patterns;

import java.util.Scanner;

public class GCD {
	public static int gcd(int a, int b) {
		while(a != 0 && b != 0) {
			if(a>b) {
				a = a%b;
			}
			else {
				b = b%a;
			}
		}
		if(a !=0) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String[] args) {

		Scanner s = new  Scanner(System.in);
		System.out.println("Enter numbers");
		int a =s.nextInt();
		int b =s.nextInt();
		System.out.println("GCD is :"+ gcd(a,b));
		System.out.println("Lcm is :"+ a*b/gcd(a,b));
		s.close();
	}
}

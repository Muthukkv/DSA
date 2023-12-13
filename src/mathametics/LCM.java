package mathametics;

import java.util.Scanner;

public class LCM {
	
 	static int gcd(int a,int b) {
 		
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return b;
		}

	}
	
 	static int lcm(int a,int b) {
 		int ans = (a*b)/gcd(a,b);
 		return ans;
 	}
 	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(lcm(a,b));
		s.close();
	}
}

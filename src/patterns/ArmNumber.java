package patterns;

import java.util.Scanner;

public class ArmNumber {
	public static boolean isArmstring(int n){
		int orig = n;
		int ans=0;
		int digit = (int)(Math.log10(n)+1);
		while(n>0) {
			int element = n%10;
			ans+=Math.pow(element, digit);
			n/=10;
		}
		return ans==orig;
	}
	public static void main(String[] args) {
		
			Scanner s = new  Scanner(System.in);
			System.out.println("Enter numbers");
			int a =s.nextInt();
			System.out.println(isArmstring(a));
			s.close();
		}
	}


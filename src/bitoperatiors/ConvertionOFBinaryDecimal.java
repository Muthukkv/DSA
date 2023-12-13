package bitoperatiors;

import java.util.Scanner;

public class ConvertionOFBinaryDecimal {

	//Converting Decimal into Binary

	public static String decimalToBinary(int n) {
		String b ="";
		
		while(n>=1) {
			int rem =n%2;
			n=n/2;
			b = rem+b;
		}
		return b;
	}
	public static int binaryToDecimal(String b) {
		int ans = 0;
		int powerof2=1;
		for(int i =b.length()-1;i>=0;i--) {
			if(b.charAt(i)=='1') {
				ans=ans+powerof2;
			}
			powerof2 = powerof2*2;
		}
		
		return ans;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Decimal");
		int n = s.nextInt();
		String b = decimalToBinary(n);
		System.out.println(b);
		System.out.println(binaryToDecimal(b));
		s.close();
	}

}

package recursion;

import java.util.Scanner;

public class LuckyNumber {
	public static boolean isLucky(int n, int counter) {
		if(n%counter==0) {
			return false;
		}
		if(n<counter) {
			return true;
		}
		return isLucky(n-(n/counter), counter+1);
	}
	public static void main(String[] args) {
	while(true) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to Check wether it is lucky or not:");
		int n = s.nextInt();
		System.out.println(isLucky(n, 2));
		if(n<2) {
			break;
		}
	}
		
	}
}

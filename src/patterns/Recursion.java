package patterns;

public class Recursion {
	//Print num from 1 to 5
	public static void num(int i,int n) {
		if(i>n) return;
		System.out.println(i);
		num(i+1,n);
	}
	//Print num from 5 to 1
	public static void num1(int n) {
		if(n==0) return;
		System.out.println(n);
		num1(n-1);
	}
	public static void main(String[] args) {
		num1(5);
	}
}

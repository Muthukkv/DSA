package recursion;

public class Fibonic {
	static int fibo(int n) {
		if(n==1 || n==2) {//n --> term position
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibo(6));
	}
}

package mathametics;

public class FiboSerious {
	public static void fibo(int n) {
		int first=0;
		int second = 1;
		int fiboNumber=0;
		System.out.print(first+" "+second+" ");
		for(int i = 2;i<n;i++) {
			fiboNumber=first+second;
			System.out.print(fiboNumber+" ");
			first = second;
			second=	fiboNumber;	
		}
		
	}
	
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34
		fibo(10);
	}
}

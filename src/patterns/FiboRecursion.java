package patterns;

public class FiboRecursion {
	public static int fibo(int n) {
		if (n<=1) return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void fiboSeries(int n) {
		int[] a = new int[n];
		a[0]=1;
		a[1]=1;
		for(int i=2;i<a.length;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println(fibo(5));
		fiboSeries(5);
	}
}

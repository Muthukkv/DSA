package bubblesort;

public class Fibo {
	public static void fibo(int n) {
		int[] a = new  int[n];
		a[0]=1;
		a[1]=1;
		for(int i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static int fibo1(int n) {
		if(n<=1) return n;
		return fibo1(n-1)+fibo1(n-2);
	}
	public static void bubble(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=a.length-1;j++) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	public static int binary(int target,int[] a) {
		int first =0;
		int last = a.length-1;
		
		
		while(first<=last) {
			int mid = last+first/2;
			if(target<a[mid]) {
				last = mid-1;
			}
			else if(target>a[mid]){
				first=mid+1;
			}
			
			return mid;
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
//		fibo(5);
//		System.out.println();
//		System.out.println(fibo1(5));
		int[] a = {1,2,3,4,5,6};
//		bubble(a);
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
		System.out.println(binary(45, a));
	}
}

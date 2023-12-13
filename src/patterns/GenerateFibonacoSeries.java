package patterns;

public class GenerateFibonacoSeries {
	 public static void generateFibonacciNumbers(int n) {
	       int[] a = new int[n];
	        a[0]=1;
	        a[1]=1;
	        for(int i=2;i<n;i++) {	
	        	a[i]=a[i-1]+a[i-2];
	        }
	        for(int j:a) {
	        	System.out.print(j+" ");
	        }
	        System.out.println();
	        System.out.println(a[n-1]);
	       
	 }
	public static void main(String[] args) {
		generateFibonacciNumbers(5);
	}
}

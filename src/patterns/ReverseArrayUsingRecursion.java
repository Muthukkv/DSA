package patterns;

public class ReverseArrayUsingRecursion {
	public static void reverse(int s,int e,int[] a) {
		if(s>e) return;
		int temp = a[s];
		a[s]=a[e];
		a[e]=temp;
		reverse(s+1, e-1, a);
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		reverse(0,a.length-1,a);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

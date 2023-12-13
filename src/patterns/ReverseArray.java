package patterns;

public class ReverseArray {
	public static void reverse(int[] a) {
		int s=0;
		int e=a.length-1;
		while(s<e) {
			int temp = a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
	}
	
	 
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		reverse(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

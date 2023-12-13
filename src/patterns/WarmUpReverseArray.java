package patterns;

public class WarmUpReverseArray {
	public static void reverseMethod(int[] a) {
		int first =0;
		int last = a.length-1;
		while(first<last) {
			int temp = a[first];
			a[first]=a[last];
			a[last]=temp;
			first++;
			last--;
		}
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i:a) {
			System.out.print(i+" ");
		}
		reverseMethod(a);
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

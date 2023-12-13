package arrays;

public class LinearSearch {
	public static int linearSearch(int[] a,int k) {
		for(int i= 0;i<a.length;i++) {
			if(a[i]==k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {12,54,67,89};
		int k = 67;
		System.out.println(linearSearch(a, k));
	}
}

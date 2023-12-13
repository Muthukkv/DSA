package revision;

public class SelectionSort {
	static void sort(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int min =i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	public static void main(String[] args) {
		int[] a = {3,4,1,2,6,3,8,7,5};
		int n = a.length;
		for(int i:a) {
			System.out.print(i+" ");
		}
		sort(a, n);
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

package muthu;

public class InsertionSort {
	static void insertion(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			int j=i+1;
			while(j>0 && a[j]<a[j-1]) {
				int temp = a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {2,4,53,2,12,34,32,21,1,3,5,7,6,3};
		int n = a.length;
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		insertion(a, n);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}
}

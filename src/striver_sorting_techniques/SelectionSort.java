package striver_sorting_techniques;


// The name itself indicates SELECT the MINIMUM and SWAP;
public class SelectionSort {

	static void selection_sort(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			//Starts from i because every step we find first sorting number
			for(int j=i;j<=n-1;j++) {
				if(a[j]<a[min]) {
					min=j;			
				}
			}
			//Swap
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	public static void main(String[] args) {

		int[] a = {123,4,5,67,8,9,0,9,7,6,7,53,2,14,6,67,4};
		int size=a.length;
		for(int i:a) {
			System.out.print(i+" ");
		}
		selection_sort(a,size);
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

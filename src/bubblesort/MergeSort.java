package bubblesort;

import java.util.ArrayList;

public class MergeSort {
	public static void mergeSort(int[] a, int low, int high) {
		if(low>=high) return;
		int mid=(low+high)/2;
		mergeSort(a, low, mid);
		mergeSort(a, mid+1, high);
		merge(a,low,mid,high);
	}
	public static void merge(int[] a, int low, int mid, int high) {
			ArrayList<Integer> al = new ArrayList<>();
			int left =low;
			int right =mid+1;

			while(left<=mid && right<=high) {
				if(a[left] < a[right]) {
					al.add(a[left]);
					left++;
				}
				else {
					al.add(a[right]);
					right++;
				}
			}
			while(left<=mid) {
				al.add(a[left]);
				left++;
			}
			while(right<=high) {
				al.add(a[right]);
				right++;
			}
			
			for(int i=low;i<=high;i++) {
				a[i]=al.get(i-low);
			}
	}
	public static void main(String[] args) {
		int[] arr= {1,23,4,5,6,112,1,4,1,3,34,0};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int n=arr.length;
		System.out.println();
		mergeSort(arr,0,n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}

package bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubble(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j]<arr[j-1]) {
					
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;

				}
			}
		}


	}
	public static void main(String[] args) {
		int[] arr= {34,64,56,22,17};
		int n=arr.length;
		bubble(arr);
		//System.out.println(arr[arr.length-2]);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[n-2]);
	}
}

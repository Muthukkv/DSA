package arrays;

import java.util.Arrays;

public class SecondLargest {
	public static void secondLargest(int[] a) {
		Arrays.sort(a);
		int max=0;
		int min=0;
		max=a[a.length-2];
		min=a[0];
		System.out.println(max+" "+min);

	}
	public static void main(String[] args) {
		int[] a = {12,3,456,78,1};
		secondLargest(a);
	}
}

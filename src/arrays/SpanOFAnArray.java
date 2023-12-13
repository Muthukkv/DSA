package arrays;

public class SpanOFAnArray {
	public static int span(int[] a) {
		int max=a[0];
		int min = a[0];
		for(int i = 0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		return max-min;
	}
	public static void main(String[] args) {
		int[] a = {12,3,456,78,1};
		System.out.println(span(a));
	}
}

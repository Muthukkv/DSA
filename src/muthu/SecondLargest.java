package muthu;

public class SecondLargest {
	public static int second(int[] a, int n) {
		int largest = a[0];
		int sLargest = -1;
		for(int i=0;i<n;i++) {
			if(a[i]>largest) {
				sLargest=largest;
				largest=a[i];
			}
			else if(a[i]!=largest && a[i]>sLargest) {
				sLargest=a[i];
			}
		}
		return sLargest;
	}
	public static void main(String[] args) {
		int[] a = {12,45,67,89,100};
		int n=a.length;
		System.out.println(second(a, n));
	}
}

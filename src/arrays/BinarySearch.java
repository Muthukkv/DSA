package arrays;

public class BinarySearch {
	public static int binarySearch(int[] a, int k) {
	int l,h,mid;
	l=0;
	h=a.length-1;
	mid=0;
	while(l<=h) {
		mid=(l+h)/2;
		if(k==a[mid]) {
			return mid;
		}
		else if(k<mid) {
			h=mid-1;
		}
		else {
			l = mid+1;
		}
	}
	return -1;
	}
	public static void main(String[] args) {
		int[] a = {12,54,67,89};
		int k = 67;
		System.out.println(binarySearch(a, k));
	}
}

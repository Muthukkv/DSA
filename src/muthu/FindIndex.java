package muthu;

public class FindIndex {
//	Input:
//		N = 6
//		arr[] = { 1, 2, 3, 4, 5, 5 }
//		Key = 5
//		Output:  4 5
//		Explanation:
//		5 appears first time at index 4 and
//		appears last time at index 5.
//		(0 based indexing)
	public static int find(int[] a, int target) {
		int s=0;
		int e=a.length-1;
		while(s<=e) {
			int mid=s+e/2;
			if(target<a[mid]) {
				e=mid-1;
			}
			else if(target>a[mid]) {
				s=mid+1;
			}
			else {
				return mid;
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5 };
		System.out.println(find(arr,5));
	}
}

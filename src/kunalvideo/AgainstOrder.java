package kunalvideo;

public class AgainstOrder {
	public static int aginstBinary(int[] a, int target) {
		int s=0;
		int e=a.length-1;
		boolean isAscOrder= a[s]<a[e] ;
		System.out.println(isAscOrder);

		while(s<=e) {
			int mid = s+(e-s)/2;
			if(target==a[mid]) {
				return mid;
			}

			if(isAscOrder) {

				if(target<a[mid]) {
					e = mid-1;
				}
				else {
					s=mid+1;
				}

			}
			else {
				if(target>a[mid]) {
					e = mid-1;
				}
				else {
					s=mid+1;
				}
			}
		}


		return -1;
	}
	public static void main(String[] args) {
				int[] a = {12,34,56,78,90,100};
		//int[] a = {200,100,50,25,12};
		System.out.println(aginstBinary(a, 100));
	}
}

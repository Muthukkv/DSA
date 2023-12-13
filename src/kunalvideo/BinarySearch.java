package kunalvideo;

public class BinarySearch {

	public static int binaryElement(int[] a,int target) {
		int s=0;
		int e=a.length-1;	
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(target==a[mid]) return mid;
			else if(target>a[mid]) {//90>56
				s = mid+1;
			}
			else{
				e = mid-1;
			}
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {12,34,56,78,90,100};
		System.out.println(binaryElement(a,90));
	}
}

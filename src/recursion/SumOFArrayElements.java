package recursion;

public class SumOFArrayElements {
	public static int sumArray(int[] arr,int i) {	
		if(i==arr.length) {
			return 0;
		}
		return sumArray(arr,i+1)+arr[i];
	}
	
	public static void main(String[] args) {
		int[] arr = {1,12,3,4,5};
		System.out.println(sumArray(arr,0));
	}

}

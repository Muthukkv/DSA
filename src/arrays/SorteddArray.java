package arrays;

public class SorteddArray {
	static int[] sortArr(int[] arr, int n) 
    { 
        int[] a = new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i:arr) {
        	a[i]=arr[i];
        }
        return a;
    }
	public static void main(String[] args) {
		int[] a = {3,4,2,1,5};
		int n = a.length;
		for(int i: a) {
			System.out.print(i+" ");
		}
		sortArr(a,n);
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

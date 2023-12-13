package bubblesort;

public class RevisionBUBBLE {
	public static void bubble(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=a.length-1;j++) {
				if(a[j]>a[j-1]) {
					int temp =a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {34,64,56,22,17};
		bubble(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		//System.out.println(arr[arr.length-2]);
	}
}

package striver_sorting_techniques;

public class InsertionSort {
	public static void insertionSort(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			int j=i+1;
			while(j>0 && a[j]<a[j-1]) {
				int temp = a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		 int[] arr = {30,
	        		48 ,196 ,294, 91, 31 ,577, 702 ,503,217 ,168, 409, 233, 
	        		23 ,152 ,578 ,399, 863, 25, 489, 718, 454 ,798 ,164 ,182,
	        		498 ,731, 271, 899, 936 ,897 };
		 //int[] a = {6,5,4,3,2,1};
	        
	        int n = arr.length;
	        insertionSort(arr,n);
	        for(int i:arr){
	            System.out.print(i+" ");
	        }
	}
}

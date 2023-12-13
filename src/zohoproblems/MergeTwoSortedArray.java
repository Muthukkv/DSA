package zohoproblems;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int m=5;
		int n=4;
		int[] a = {1,2,3,6,9};
		int[] b = {2,4,8,9};
		int[] temp = new int[m+n];
		int i=0,j=0, t=0;
		while(i<m && j<n) {
			if(a[i]<b[j]){
				temp[t++]=a[i];
				i++;
			}
			else{
				temp[t++]=b[j];
				j++;
			}
		}
		while(i<m) {
			temp[t++]=a[i];
			i++;
		}
		while(j<n) {
			temp[t++]=b[j];
			j++;
		}
		for(int z=0;z<m+n;z++) {
			System.out.print(temp[z]+" ");
		}
	}
}

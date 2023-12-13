package patterns;
import java.util.*;
public class Solution {
	static void valueEqualToIndex(int arr[], int n) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<arr.length;i++){		
			if(i==arr[i]){			
				al.add(arr[i]);			
			}
		}
		for(int j:al) {
			System.out.println(j);
		}
		
		
	}
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {15, 2, 45, 12, 7};
		valueEqualToIndex(arr,n);
	}
}

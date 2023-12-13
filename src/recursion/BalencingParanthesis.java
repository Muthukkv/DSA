package recursion;

import java.util.Scanner;

public class BalencingParanthesis {
	public static void balPara(char[] arr,int n,int i,int o,int c) {
		

		if(i==arr.length) {
			System.out.println(arr);
		}
		if(o<n) {
			arr[i]='(';
			balPara(arr,n, i+1, o+1, c);
		}
		if(c<o) {
			arr[i]=')';
			balPara(arr,n, i+1, o, c+1);
		}
		
	}
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 char[] arr = new char[n*2];
	 balPara(arr, n,0, 0, 0);
	 s.close();
	}
}

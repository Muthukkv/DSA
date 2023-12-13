package recursion;

import java.util.Scanner;

public class Permutations {
	public static void permutaion(char[] c,int fi) {
		//length! combination will get  
		if(fi == c.length-1) {
			System.out.println(c);
			return;
		}
		for(int i=fi;i<c.length;i++) {
			swap(c,i,fi);
			permutaion(c, fi+1);
			swap(c, i, fi);// Undo the swap.
		}
	}
	public static void swap(char[] c,int i,int fi) {
		char temp = c[i];
		c[i]=c[fi];
		c[fi]=temp;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.next();
		permutaion(str.toCharArray(), 0);
		s.close();
	}
}

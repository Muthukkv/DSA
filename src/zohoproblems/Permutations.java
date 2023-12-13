package zohoproblems;

public class Permutations {
	public static void fun(char[] c,int fi) {
		if(fi==c.length-1) {
			System.out.println(c);
			return;
		}
		for(int i=fi;i<c.length;i++) {
			swap(c, i, fi);
			fun(c,fi+1);
			swap(c, i, fi);
		}
		
	}
	public static void swap(char[] c, int i, int fi) {
		char temp =c[i];
		c[i]=c[fi];
		c[fi]=temp;
	}
	public static void main(String[] args) {
		String a="abc";
		fun(a.toCharArray(), 0);
	}
}

package recursion;

public class RopeCutting {
	public static int rPices(int n, int a, int b, int c) {
		if(n==0) {
			return 0;
		}
		else if(n<0) {
			return -1;
		}
		int temp1 = rPices(n-a, a, b, c);
		int temp2 = rPices(n-b, a, b, c);
		int temp3 = rPices(n-c, a, b, c);
		int pices = Math.max(temp3, Math.max(temp1, temp2));
		if(pices==-1) {
			return -1;
		}
		return pices+1;
	}
	public static void main(String[] args) {
		System.out.println(rPices(20,5,8,7));
	}
}

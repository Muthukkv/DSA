package recursion;

public class JosephusProblem {
	public static int jos(int N, int K) {
		if(N==1) {
			return 0;
		}
		return (jos(N-1,K)+K)%N;
	}
	public static void main(String[] args) {
		System.out.println(jos(7,3));
	}
}

package zohoproblems;

public class ClaimbingStairs {
	public static int  ways(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int possibleWays = ways(n-1)+ways(n-2);
		return possibleWays;
	}
	public static void main(String[] args) {
		System.out.println(ways(4));
	}
}

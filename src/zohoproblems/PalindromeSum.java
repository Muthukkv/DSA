package zohoproblems;

public class PalindromeSum {
	public static long sum(int n) {
		int original = n;
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n/=10;
		}
		int ans=rev+original;
		int secondOriginal=ans;
		int secondReverse=0;
		while(ans>0) {
			secondReverse=secondReverse*10+ans%10;
			ans/=10;
		}
		if(secondReverse==secondOriginal) {
			return secondReverse;
		}
		else {
			return 0;
		}
		
	}
	 public static void main(String[] args) {
		System.out.println(sum(30));;
	}
}

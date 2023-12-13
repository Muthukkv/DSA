package kunalvideo;

public class ReverseNumber {
	public static void revNum(long num) {
		long original =num;
		long rev = 0l;
		while(num>0) {
			rev=(rev*10)+num%10;
			num/=10;
		}
		System.out.println(original+" : "+rev);
	}
	public static void main(String[] args) {
	revNum(123456l);
	}
}

package kunalvideo;

public class ArmStrongNumber {
	static boolean isArmStrong(long n) {
		long original = n;
		long rev = 000l;
		while(n>0) {
			long rem = n%10;
			n/=10;
			rev += rem*rem*rem;
		}
		return original==rev;
	}
	
	public static void main(String[] args) {
		long n = 34565769l;
		for(long i=0l;i<n;i++) {
			if(isArmStrong(i)) {
				System.out.print(i+" ");
			}
		}
	}
}

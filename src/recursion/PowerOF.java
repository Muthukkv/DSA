package recursion;

public class PowerOF {
	public static long power(int x, int y) {
//		
//		if(y==0) {
//			return 1;
//		}
//		return power(x, y-1)*x;
		long ans=1;
		for(int i=0;i<y;i++) {
			
			ans=ans*x;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(power(5, 8));
		
	}
}

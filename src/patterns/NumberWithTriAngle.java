package patterns;

public class NumberWithTriAngle {
	public static void pattern(int n) {
		for(int i = 1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j = i;j>1;j--) {
				System.out.print(j);
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		pattern(5);
	}
}

package patterns;

public class AerowPattern {
	public static void pattern(int n) {
		int row = 2*n;
		for(int i=0;i<row;i++) {
			
			if(i<=n) {
				for(int j = 0;j<i;j++) {
					System.out.print("* ");
				}
			}
			else if(i>n) {
				for(int j = 0;j<row-i;j++) {
					System.out.print("* ");
					
				}
				
			}
						
			
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i = 0;i<2*n;i++) {
			int c = i>n ? 2*n-i : i;
			for(int j = 0;j<c;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern2(5);
	}
}

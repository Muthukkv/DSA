package patterns;

public class NumberBox {
	public static void pattern(int n) {
		
		for(int i = 0;i<=2*n;i++) {
			
			for(int j=0;j<=2*n;j++) {
				int value= n-Math.min(Math.min(i, j),Math.min(2*n-i, 2*n-j))+1;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(4-1);
	}
}

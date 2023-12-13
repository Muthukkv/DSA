package patterns;

public class PrintPattern {
	//For n = 2
	// 2 2 1 1
	// 2 1
	public void pattern(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				for(int k=1;k<=i;k++) {
					System.out.print(j+" ");
				}
			}
			System.out.print("$");
		}
	}
	public static void main(String[] args) {
		PrintPattern p = new PrintPattern();
		p.pattern(2);
	}
}

package patterns;

public class Diamend {
	//Find Arrow problem then spend the straight line of Arrow problem:
	public static void pattern(int n) {
		for(int i = 0;i<2*n;i++) {
			int c = i>n ? 2*n-i:i;//Instead of if else condition
			int space = n-c;
			for(int s = 0;s<space;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<c;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}
}

package recursion;
import java.util.Scanner;
public class CountDigits {
	static int countMethod(int n) {
		if(n==0) {
			return 0;
		}
		
		return countMethod(n/10)+1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countMethod(n));
		s.close();
	}
}

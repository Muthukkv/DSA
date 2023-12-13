package zohoproblems;

public class SumOf2Squeres {
	static boolean sumOf(int n) {
		for(int i = 1;i*i<n;i++) {
			for(int j = 1;j*j<n;j++) {
				if(i*i+j*j==n) {
					System.out.println(i+"^2 "+j+"^2 ");
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n = 169;
		if(sumOf(n)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
			
		}
	}
}

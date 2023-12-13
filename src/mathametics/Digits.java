package mathametics;

public class Digits {
	public static int getDegit(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(getDegit(12345));
	}

}

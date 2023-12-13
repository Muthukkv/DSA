package recursion;

public class NNatural {
	static void naturalDESC(int n) {
		if(n<1) {
			return;
		}
		System.out.println(n);
		naturalDESC(n-1);
	}
	static void naturalASC(int n) {
		if(n==0) {
			return;
		}
		naturalASC(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		System.out.println("DESC ORDER");
		naturalDESC(5);
		System.out.println("ASC ORDER");
		naturalASC(5);

	}
}

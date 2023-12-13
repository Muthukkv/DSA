package recursion;

public class TowerOfHanai {
	public static void hanai(int n,char src, char aux, char dest) {
		if(n==1) {
			System.out.println(src +" --> "+dest);
			return;
		}
		hanai(n-1, src, dest, aux);	
		hanai(1, src, aux, dest);		
		hanai(n-1, aux, src, dest);		
	}
	public static void main(String[] args) {
		hanai(3, 'A', 'B', 'C');
	}
}

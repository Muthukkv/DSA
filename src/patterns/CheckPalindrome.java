package patterns;

public class CheckPalindrome {
	public static boolean check(String str) {
		char[] c = str.toCharArray();
		int first = 0;
		int last = c.length-1;
		while(first<last) {
			if(c[first] == c[last]) return true;
			first ++;
			last --;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(check("muthu"));
	}
}

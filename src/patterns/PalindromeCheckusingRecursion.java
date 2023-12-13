package patterns;

public class PalindromeCheckusingRecursion {
	public static boolean isPalindrome(String str) {
        return checkPalindrome(0,str);
    }
    public static boolean checkPalindrome(int i,String s){
    	if(i>s.length()/2) return true;
    	char[] c = s.toCharArray();
    	if(c[i] != c[c.length-i-1]) return false;
    	return checkPalindrome(i+1, s);
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar"));
	}
}

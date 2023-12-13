package recursion;

import java.util.Scanner;

public class KeypadLetterCombination {
	static String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static void possibleWords(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		String key = keypad[s.charAt(0)-48];//Ex: s="846" means -> keypad[s.charAt(0)]->keypad[8]->"tuv";
		for(int i = 0;i<key.length();i++) {
		possibleWords(s.substring(1), ans+key.charAt(i));
		}
	}
	public static void main(String[] args) {
		while(true) {
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Value:");
			String s = scan.next();
			possibleWords(s, "");
			System.out.println();
			if(s.equals("0")) {
				break;
			}
		}
	}

}

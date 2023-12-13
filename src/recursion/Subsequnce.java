package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequnce {
	static ArrayList<String> al = new ArrayList<>();
	static void subSequence(String s,String ans) {
		if(s.length()==0) {
			al.add(ans);
			return;
		}
		
		//Pick 
		subSequence(s.substring(1),ans+s.charAt(0));
		//Not Pick
		subSequence(s.substring(1),ans);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		subSequence(s, "");
		System.out.println(al);
		scan.close();
	}
}

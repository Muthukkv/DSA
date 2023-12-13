package zohoproblems;

public class VowelNextElements {
	public static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c)!=-1;
	}
	public static void vowelMethod(String s) {
		char[] ch = s.toCharArray();
		int i=0;
		while( i<ch.length) {
			if(isVowel(ch[i])) {
				System.out.print(ch[i]);
				i++;
				while(i<ch.length && !isVowel(ch[i])) {
					System.out.print(ch[i]);
					i++;
				}
				System.out.println();
			}
			else {
				i++;
			}
		}
	
	}
	public static void main(String[] args) {
		vowelMethod("manager");
		
	}
}





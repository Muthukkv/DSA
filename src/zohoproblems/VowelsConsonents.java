package zohoproblems;

public class VowelsConsonents {
	
	public static void vowelConCount(String s) {
		
		String vowel="";
		String cons = "";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c >='a'&&c<='z') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vowel+=c;
				}
				else {
					cons+=c;
				}
			}
		}
	System.out.println(vowel);
	System.out.println(cons);
		
	}
	
	public static void main(String[] args) {
		vowelConCount("muthu");
	}
}

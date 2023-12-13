package zohoproblems;

public class Expand {
	//
	
	public static void expand(String a) {
		char[] c = a.toCharArray();
		for(int i =0;i<c.length;i++) {
			char ch =a.charAt(i);
			int num=0;
			if(ch >='0'&& ch<='9') {
				 num = ch-48;
				
			}
//			 for(int j=0;j<num;i++) {
//					System.out.println(ch-1+48);
//				}
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args) {
		expand("a2b3c11");
	}
}

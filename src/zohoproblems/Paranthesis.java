package zohoproblems;

public class Paranthesis {
	public static void pattern(char[] ch ,int i,int n, int o, int c) {
		
		if(i==ch.length) {
			System.out.println(ch);
		}
	    if(o<n) {
	    	ch[i]='(';
	    	 pattern(ch,i+1,n,o+1,c);
	    }
	    if(c<o) {
	    	ch[i]=')';
	    	 pattern(ch,i+1,n,o,c+1);
	    }
	   
	}
	public static void main(String[] args) {
		int n=3;
		char[] ch = new char[2*n];
		pattern(ch,0,n,0,0);
	}
}

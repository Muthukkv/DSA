package zohoproblems;

public class BalancedPranthesis {
	public static void paranthesis(char[] ch,int n,int i,int o,int c) {
	
		if(i==ch.length) {
			System.out.println(ch);
		}
		if(o<n) {
			ch[i]='{';
			paranthesis(ch, n, i+1, o+1, c);
		}
		if(c<o) {
			ch[i]='}';
			paranthesis(ch, n, i+1, o, c+1);
		}
		
		
	}
	public static void main(String[] args) {
		char[] ch = new char[4];
		paranthesis(ch, 2, 0, 0, 0);
	}
}

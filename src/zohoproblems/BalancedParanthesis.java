package zohoproblems;

public class BalancedParanthesis {
	public static void fun(int n,char[] ch,int i,int o,int c) {
		if(i==ch.length) {
			System.out.println(ch);
		}
		
		if(o<n) {
			ch[i]='{';
			fun(n,ch,i+1,o+1,c);
		}
		if(c<o) {
			ch[i]='}';		
			fun(n,ch,i+1,o,c+1);
		}
	}
	public static void main(String[] args) 
	{   int n=2;
		char[] ch = new char[2*n];
		fun(n,ch,0,0,0);
	}
}

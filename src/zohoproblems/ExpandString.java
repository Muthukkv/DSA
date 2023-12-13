package zohoproblems;

public class ExpandString {
	public static void expand(String s) {//a12b3
		char[] c = s.toCharArray();
		char temp=' ';
		int num=0;
		for(int i = 0;i<c.length;i++) {
			if(c[i]>='0'&&c[i]<='9') {	
				// if it is number means we need to atore the before char
				temp=c[i-1];
				
				while(i<c.length && c[i]>='0' && c[i]<='9') {
				num = (num*10)+c[i]-48;	
				i++;
				}
			}
			for(int j=0;j<num;j++) {
				System.out.print(temp);
			}
			num=0;
		}
	}
	public static void main(String[] args) {
		expand("a11b10");
	}
}

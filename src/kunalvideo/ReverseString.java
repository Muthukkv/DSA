package kunalvideo;

public class ReverseString {
	public static void method1(String name) {
		String[] s = name.split(" ");
		String[] ans = new String[s.length] ;
		int store=0;
		for(int i=s.length-1;i>=0;i--) {
			
			ans[store]=s[i];
			store++;
		}
		for(String rev:ans) {
			System.out.print(rev+" ");
		}
	}
	public static void method2(String name) {
		String ans="";
		for(int i=name.length()-1;i>=0;i--) {
			ans+=name.charAt(i);
		}
		System.out.println(ans);
	}
	public static void method3(String a) {
		String[] s = a.split(" ");
		String and="";
		for(int i=0;i<s.length;i++) {
			String word = s[i];
			String revWord ="";
			for(int j=word.length()-1;j>=0;j--) {
				revWord += word.charAt(j);
			}
			and+=revWord+" ";
		}
		System.out.print(and);
	}
	
	public static void main(String[] args) {
		System.out.println("hello world welcomes muthu");
		method1("hello world welcomes muthu");
		System.out.println();
		method2("hello world welcomes muthu");
		method3("hello world welcomes muthu");
		
	}
}

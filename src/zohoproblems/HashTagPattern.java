package zohoproblems;

public class HashTagPattern {
	public static void main(String[] args) {
	 int n = 10;
	 for(int i =0;i<n;i++) {
		 for(int s=0;s<n-i;s++) {
			 System.out.print(" ");
		 }
		 for(int j = 0;j<n;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	}
}

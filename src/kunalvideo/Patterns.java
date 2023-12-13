package kunalvideo;

public class Patterns {
	public static void pattern1(int n) {

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		int k=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++) {
				System.out.print(k);
			}
			k++;
			System.out.println();}
		}
		public static void pattern3(int n) {
			for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}
		public static void pattern4(int n) {
			for(int i=0;i<n;i++) {
				//Space
				for(int s=0;s<n-i-1;s++) {
					System.out.print(" ");
				}
				
				//Star
				for(int j=0;j<2*i+1;j++) {
					System.out.print("*");
				}
				
				//Space
				for(int s=0;s<n-i-1;s++) {
					System.out.print(" ");
				}
				System.out.println();
			}
				
		
		}
		public static void pattern5(int n) {
			for(int i=0;i<n;i++) {
				//Space
				for(int s=0;s<i;s++) {
					System.out.print(" ");
				}
				
				//Star
				for(int j=0;j<2*n -(2*i +1);j++) {
					System.out.print("*");
				}
				
				//Space
				for(int s=0;s<i;s++) {
					System.out.print(" ");
				}
				System.out.println();
			}
				
		
		}
		public static void pattern6(int n) {
			for(int i=0;i<2*n;i++) {
				int s= n-i+1;
				int as= s>n ? s:2*n-i;
				if(s<n) {
					for(int j=0;j<as;j++) {
						System.out.print(" ");
					}
				}
				else {
					for(int j=0;j>as;j++) {
						System.out.print(" ");
					}
				}
				for(int k=0;k<2*i+1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		public static void main(String[] args) {
		
			pattern6(5);
			
			
		}
	}

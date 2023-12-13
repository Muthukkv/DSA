package zohoproblems;

/*
 * print out Space
 * print *
 * print inside space
 * print *
 */
public class HallowStarPattern {
	public static void main(String[] args) {
	int n=9;
	int os=n/2;
	int is=1;
	for(int i=0;i<n;i++) {
		
		//Outter space:
		for(int j=0;j<os;j++) {
			System.out.print(" ");
		}

		if(i<n/2) os--;
		else os++;
		
		//Star
		if(i==0 || i==n-1) {
			System.out.println("*");
		}
		else {
		//Inner space
		System.out.print("*");
		for(int k=0;k<is;k++) {
			System.out.print(" ");
		}
		if(i<n/2) {
			is+=2;
		}else {
			is-=2;
		} 
		
		System.out.println("*");
		}
	}
		
	}
}

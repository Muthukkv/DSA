package zohoproblems;

public class IndexAddEven {
	public static void indexOddEven(int n) {
		int[] a= {12,3,234,43,21,17,16,91,77};
		int[] odd =new int[n/2];
		int[] eve = new int[n/2];
		int i,j,o=0,e = 0;
		for( i=1;i<=n;i++) {
			if(i%2==0 && i<n) {
				eve[e++]=a[i];
			}
			else if(i%2!=0 && i<n) {
				odd[o++]=a[i];
			}
		}
		System.out.println(o);
		//Odd bubble
		for(i=0;i<o;i++) {
			for(j=1;j<=o-i;j++) {
				if(odd[j]<odd[j-1] && j<o) {
					int t=odd[j];
					odd[j]=odd[j-1];
					odd[j-1]=t;
				}
			}
		}
		// Even Bubble
		for(i=0;i<e;i++) {
			for(j=1;j<=j-i;j++ ) {
				if(eve[j]>eve[j-1] && j<e) {
					int t=eve[j];
					eve[j]=eve[j-1];
					eve[j-1]=t;
				}
			}
		}
		for(i=0,j=0;i<o&&j<e;i++,j++) {
			System.out.print(odd[i]);
			System.out.print(eve[j]);
		}
	}
	public static void main(String[] args) {
		indexOddEven(9);
	}
}

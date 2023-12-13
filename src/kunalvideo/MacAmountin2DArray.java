package kunalvideo;

public class MacAmountin2DArray {
	public static int sumMax(int[][] a) {
		int maxSum = Integer.MIN_VALUE;
		for(int[] i:a) {
			int sum=0;
			for(int j:i) {
				sum+=j;
			}

			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		return maxSum;
		
		
	}
	public static void main(String[] args) {
		int[][] a = 
			{	{1,2,3},
				{3,4,3},
				{7,2,9}
		    };
		
		System.out.println(sumMax(a));
	}
}

/*
 * for(int i=0;i<a.length;i++) {
			int sum =0 ;
			for(int j=0;j<a[i].length;j++) {
				
				sum +=a[i][j];
				
			}
			
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		return maxSum;
 */


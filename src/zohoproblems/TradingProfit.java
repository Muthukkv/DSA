package zohoproblems;

public class TradingProfit {
	public static void main(String[] args) {
		int[] a = {100, 180, 260, 310, 40, 535, 695};
		int min=a[0];
		
		int maxProfit=0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}	
			int potential = a[i]-min;
			if(potential>maxProfit) {
				maxProfit+=potential;
			}
		}
		
		
	System.out.println(maxProfit);	
	
	
	}
}

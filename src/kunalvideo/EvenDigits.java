package kunalvideo;


public class EvenDigits {

	static int digits(int number) {
		return (int)(Math.log10(number))+1;
		 
	}
	static int evenCOunt(int[] a) {
		int count =0;
		for(int i =0;i<a.length;i++) {

			if( digits(a[i]) %2==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = {556,78899,3,4455,56,1234};
		System.out.println(evenCOunt(a));
	}



}





/*
	int digit =0;
	while(number>0) {
		digit++;
		number/=10;
	}
	return digit;

 */

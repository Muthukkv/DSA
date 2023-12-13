package muthu;

public class Muthu {
	public static void main(String[] args) {
		String name ="muthu";
		String ans = "";
		for(int i=name.length()-1;i>=0;i--) {
			ans+=name.charAt(i);
		}
		System.out.println(ans);
		int[] a = {12,34,2,1,345,567,890,456,1,1,45};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=a.length-1;j++) {
				if(a[j]<a[j-1]) {
					int temp =a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

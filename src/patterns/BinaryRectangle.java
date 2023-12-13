package patterns;

public class BinaryRectangle {
	public static void pattern(int n) {
		 for(int i=0;i<n;i++){
	            int start = (i%2)==0 ? 1:0;
	            for(int j=0;j<=i;j++){
	                System.out.print(start+" ");
	                start=1-start;//Flip
	            }
	            System.out.println();
	        }
	}
	public static void main(String[] args) {
		pattern(5);
	}
}

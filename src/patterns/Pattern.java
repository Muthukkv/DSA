package patterns;

public class Pattern {
	static void printPattern(int N){
//        for(int i=0;i<N;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//             System.out.print(" ");
//        }
        
        
       String s="*";
       
        for(int i=0;i<N;i++)
        {
            System.out.print(s+" ");
            s+="*";
        }
      
    }
	public static void main(String[] args) {
		printPattern(5);
	}
}

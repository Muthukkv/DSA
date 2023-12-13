package patterns;

public class PalindromeArray {
	public static int palinArray(int[] a, int n)
    {
         for(int i=0;i<n;i++){
             if(!isPalindrome(a[i])) { return 0;}
             
         }
         return 1;
    }
    
    public static boolean isPalindrome(int num){
        int orig = num;
        int ans=0;
        while(num>0){
            ans =(ans*10)+num%10;
            num/=10;
        }
       
      return orig==ans;
    }
    public static void main(String[] args) {
    	int n = 5;
    	int[] a ={111,222,333,444,555};
		System.out.println(palinArray(a, n));
	}
}

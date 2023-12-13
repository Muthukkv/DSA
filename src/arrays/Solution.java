package arrays;

import java.util.HashSet;

class Solution
{
   
	  static String removeDups(String S) {
	        String ans="";
	        HashSet<Character> hs = new HashSet<>();
	        
	        for(int i=0;i<S.length();i++) {
	        	if(hs.add(S.charAt(i))) {
	        		ans+=S.charAt(i);
	        	}
	        }
	        return ans;
	    }
	 public static void main(String[] args) {
		String s = "zovaa";
		System.out.println(removeDups(s));
	}
}

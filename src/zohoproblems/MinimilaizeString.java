package zohoproblems;

import java.util.HashMap;
import java.util.Set;

public class MinimilaizeString {
	public static void minimalize(String s) {//aaabccc -> a3b1c3

		char[] c = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i =0;i<c.length;i++) {
			if(hm.containsKey(c[i])) {
				int count = hm.get(c[i]);
				count++;
						
			hm.put(c[i], count);
				
			}else {
				hm.put(c[i], 1);
			}
		}
		Set<Character> key = hm.keySet();
		for(Character i:key) {
			System.out.print(i+""+hm.get(i));
		}
	}
	public static void main(String[] args) {
		minimalize("aaaaaaaaaaaaaaaaaaaaaaaaabbbbc");
	}
}

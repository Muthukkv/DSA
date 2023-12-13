package muthu;

import java.util.HashMap;
import java.util.Set;

public class StringHash {
	public static void main(String[] args) {
		String a = "aabcddekkkkzzzzzzzzzzzzxxxxxxxxxxxxxxxxxxxxxxx";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<a.length();i++) {
			char key=a.charAt(i);
			int freq=0;
			if(hm.containsKey(key))  freq=hm.get(key);
			freq++;
			hm.put(key,freq);
		}
		Set<Character> ks = hm.keySet();
		for(char i:ks) {
			System.out.println(i+"-->"+hm.get(i));
		}
	}
}

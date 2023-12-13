package zohoproblems;

import java.util.HashMap;
import java.util.Set;

public class AaaaBbbCccCount {
	public static void main(String[] args) {
		String input="aaabbbbccccccccccccccc";//output:a3b4c15
		
	
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0;i<input.length();i++) {
			//Find what is the current char like 0 index current char is :a;
			char current=input.charAt(i);

//If the current char is already present in map means we need get that char	and find
//Occurrence of that and replace the map.		
			if(hm.containsKey(current)) {
				
				int count = hm.get(current);
				count++;
				hm.replace(current, count);
			}
			else {
				//If the char is not present in the map means we need to add and that occurence will be 1
				hm.put(current, 1);
			}
		}
		Set<Character> key = hm.keySet();
		for(Character i:key) {
			System.out.print(i+""+hm.get(i));
		}
	}
}

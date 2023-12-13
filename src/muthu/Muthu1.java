package muthu;

import java.util.*;

public class Muthu1 {
	public static void main(String[] args) {
		int[] a = {1,1,1,2,2,3,3,4,4,5,6,7,8,9,12};
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int key = a[i];
			int freq=0;
			if(hm.containsKey(key)) freq=hm.get(key);
			freq++;
			hm.put(key, freq);
		}
		Set<Integer> ks = hm.keySet();
		for(int i:ks) {
			System.out.println(i+"-->"+hm.get(i));
		}
	}
}

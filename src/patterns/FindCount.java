package patterns;

import java.util.HashMap;
import java.util.Set;

public class FindCount {
	 public static void main(String[] args) {
		int[] a = {1,2,2,3,4,5,6,4,5,5,5};
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int key =a[i];
			int value =0;
			if(hm.containsKey(key)) value=hm.get(key);
			
			value++;
			hm.put(key, value);
		}
		Set<Integer> ks = hm.keySet();
		for(int i:ks) {
			System.out.println(i+"--->"+hm.get(i));
		}
	}
}

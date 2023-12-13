package muthu;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HighestLowestFrequency {
	public static void freq(int []a,int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int key =a[i];
			int freq=0;
			if(hm.containsKey(key)) freq=hm.get(key);
			freq++;
			hm.put(key, freq);
		}
		
		
		Set<Integer> keySet = hm.keySet();
		for(int i:keySet) {
			System.out.println(i+"-->"+hm.get(i));
			
		}
		  int maxFreq = 0, minFreq = n;
	        int maxEle = 0, minEle = 0;
	        // Traverse through map and find the elements
	        for (Entry<Integer, Integer> entry : hm.entrySet()) {
	            int count = entry.getValue();
	            int element = entry.getKey();

	            if (count > maxFreq) {
	                maxEle = element;
	                maxFreq = count;
	            }
	            if (count < minFreq) {
	                minEle = element;
	                minFreq = count;
	            }
	        }

	        System.out.println("The highest frequency element is: " + maxEle);
	        System.out.println("The lowest frequency element is: " + minEle);
		
		
	}
	public static void main(String[] args) {
		int[] a = {12,3,3,6,6,6,1,7};
		freq(a,8);
	}
}

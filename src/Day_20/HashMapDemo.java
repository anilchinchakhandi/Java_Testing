package Day_20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		//Declaration
		HashMap hm = new HashMap();
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		
		
		// Adding pairs in HashMap
		
		hm1.put(101,"jhon");
		hm1.put(102, "jogha");
		hm1.put(103, "Anil");
		hm1.put(104, "bunny");
		
		System.out.println(hm1);
		
		//size of the HashMap
		
		System.out.println(hm1.size());
		
		// remove the element
		System.out.println(hm1.remove(101));
		
		//Access values from using key
		
		System.out.println(hm.get(102));
		
		// Get all the keys or values or pairs of the HashMap
		
		System.out.println(hm1.keySet());
		System.out.println(hm1.values());
		System.out.println(hm1.entrySet());
		
		//Read the values from HashMap
		// Normal for loop is not possible
		
		// Using Enhanced for loop
		for(int k:hm1.keySet()) {
			System.out.println(k + "    "+ hm1.get(k));			
		}
		
		//using Iterator method
		
		Iterator<Entry<Integer,String>>it=hm1.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}

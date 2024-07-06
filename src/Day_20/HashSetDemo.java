package Day_20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration
		HashSet myset = new HashSet();
		Set myset1 = new HashSet();
		
		// Store only homogeneous values
		HashSet<String> myset3 = new HashSet<String>();
		
		// Adding the data into HashSet
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add(100);
		myset.add(null);
		
		System.out.println(myset);
		
		// Size of the HashSet
		
		System.out.println(myset.size());
		
		// printing the HasSet
		
		System.out.println(myset);
		
		// Remove the elements from HashSet using directly pass the value we dont have index part in HasSet
		System.out.println(myset.remove(100));
		System.out.println(myset);
		
		// Insertion is not possible in Set collection
		
		// Accessing the specific element is not possible
		
		// Read all the value of the HashSet
		// normal for loop we cannot read the element of the HashSet
		
		// using enhanced for loop
		
		for(Object x:myset) {
			System.out.println(x);
		}
		
		// using Iterator

		Iterator it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		// Remove all the value from HashSet
		
		// System.out.println(myset.clear());
		
	}

}

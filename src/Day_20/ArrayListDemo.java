package Day_20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Declaration
		 ArrayList mylist = new ArrayList();
		 List mylist1 = new ArrayList();
		 
		 // Store only Homogeneous data
		 ArrayList<Integer> mylist2 = new ArrayList<Integer>();
		 
		 // we have Employee class to get object from Employee
//		 ArrayList<Employee> mylist4 = new ArrayList<Employee>();
		 
		 // Adding data in to ArrayList
		 mylist.add(100);
		 mylist.add(10.5);
		 mylist.add("Welcome");
		 mylist.add('A');
		 mylist.add(true);
		 mylist.add(100);
		 mylist.add(null);
		 mylist.add(null);
		 
		 // size of ArrayList
		 System.out.println(mylist.size());
		 
		 // Printing ArrayList
		 System.out.println("Printing data from ArrayList: "+mylist);
		 
		 //Remove the element from ArrayList
		 System.out.println(mylist.remove(5));
		 System.out.println(mylist);
		 
		 // Insert element in to ArrayList
		 mylist.add(2,"java");
		 System.out.println(mylist);
		 
		 
		 // Modify the element in ArrayList
		 mylist.set(2,"Python");
		 System.out.println(mylist);
		 
		 // Access the specific element from the ArrayList
		 System.out.println(mylist.get(3));
		 
		 // Reading all the elements from the ArrayList
		 
		 //using for loop:
		 for(int i=0;i<mylist.size();i++) {
			 System.out.println(mylist.get(i));
		 }
		 
		 //using enhance for loop
		 
		 for(Object x:mylist) {
			 System.out.println(x);
		 }
		 
		 // using iterator method
		 
		 Iterator it = mylist.iterator() ;
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 //Checking the ArrayList is empty
		 System.out.println(mylist.isEmpty());
		 
		 //Remove all the elements from the 
		 // System.out.println(mylist.clear());
		 
		 // Remove multiple elements from the ArrayList
		 ArrayList Remove = new ArrayList();
		 Remove.add(100);
		 Remove.add("Welcome");
		 
		 mylist.removeAll(Remove);
		 System.out.println(mylist);

	}

}

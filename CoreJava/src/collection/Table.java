package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Table {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Hash map, Linked hash map, tree map = random , order wise , Ascending order
			// stores in Key and Value and only unique elements
			// NO null key and NO null values 
			// No order 
			Hashtable<Integer, String> a = new Hashtable<Integer, String>();
			
			a.put(1, "ashok");
			a.put(2, "ashok1");
			a.put(3, "ashok2");
			a.put(4, "ashok3");
			//a.put(null, "");
	        
			System.out.println(a.get(3));
			System.out.println(a.size());
			System.out.println(a.replace(2, "netflix"));
			System.out.println(a);

	       System.out.println("*****************");
	       
	       //Print all Enumeration
	         Enumeration it = a.elements();
	         while (it.hasMoreElements()) {
	        	 
				System.out.println(it.nextElement());
				
			}
	         
	       System.out.println("*****************"); 
	       
	       Set it1 = a.entrySet();
	       System.out.println(it1);
		
			}
			
		
	}



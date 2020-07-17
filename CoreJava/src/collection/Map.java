package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hash map, Linked hash map, tree map = random , order wise , Ascending order
		// stores in Key and Value and only unique elements
		// one null key and multiple null values 
		// No order 
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		
		a.put(1, "ashok");
		a.put(2, "ashok1");
		a.put(3, "ashok2");
		a.put(4, "ashok3");
		a.put(null, "");
        
		System.out.println(a.get(3));
		System.out.println(a.size());
		System.out.println(a.replace(2, "netflix"));
		System.out.println(a);
		
		//For each loop
       for (Entry b : a.entrySet()) {
			
    	   System.out.println(b.getKey());
    	   System.out.println(b.getValue());
		}
       
       System.out.println("*****************");
       
       
       //Employee class object
       Employee b4 = new Employee("naveen",20,"QA");
       Employee b1 = new Employee("nav",21,"QA");
       Employee b2 = new Employee("naven",22,"QA");
       Employee b3 = new Employee("navee",23,"QA");
       
       // Hash map
       HashMap<Integer, Employee> c = new HashMap<Integer, Employee>();
       c.put(1, b4);
       c.put(2, b1);
       c.put(3, b2);
       c.put(4, b3);
       
       //Print all 
       for (Entry<Integer, Employee> d : c.entrySet()) {
    	   
    	int e = d.getKey();
    	Employee details = d.getValue();
    	System.out.println(e + "INFO");
    	System.out.println(details.name +" "+details.age + " " +details.dept);
	}
       
       System.out.println("*****************");
	
		}
		
	}



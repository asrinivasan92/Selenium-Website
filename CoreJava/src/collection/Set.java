package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Hashset , treeset, linked hashset
		// Does not accept duplicate values 
		// No sequential order 
		
		HashSet<String> a= new HashSet<String>();
		a.add("naveen");
		a.add("naveen");
		a.add("ram");
		a.add("ram");
		a.add("priya");
		System.out.println(a.remove("ram"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		//iterator 
		
		System.out.println(a);
		
		System.out.println("**************");
		
		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String emp = it.next();
			System.out.println(emp);
		}
	}

}

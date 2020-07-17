package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// can accepts duplicate values 
		// maintain insertion order 
		// array list , linked list and vector class implements List Interface
		// array has fixed size int a[] = new int[3];
		// array list is dynamic , can access an insert in any features 
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("naveen");
		a.add("naveen");
		a.add("ram");
		a.add("ram");
		a.add("priya");
		//a.remove(1);
        System.out.println(a.indexOf("priya"));
        System.out.println(a.contains("ram"));
        System.out.println(a.get(0));
        System.out.println(a.size());
        
        // To print al the values of the array list
        
        System.out.println(a);
        
        System.out.println("*****************");
        
        for (int i = 0; i < a.size(); i++) {
			
        	System.out.println(a.get(i));
		}
        
        System.out.println("*****************");
        
        //Employee class object
        Employee b = new Employee("naveen",20,"QA");
        Employee b1 = new Employee("nav",21,"QA");
        Employee b2 = new Employee("naven",22,"QA");
        Employee b3 = new Employee("navee",23,"QA");
        
        //Array list and iterator
        ArrayList<Employee> a1 = new ArrayList<Employee>();
        a1.add(b);
        a1.add(b1);
        a1.add(b2);
        a1.add(b3);
        
        //Iterator 
        
        Iterator<Employee> it =a1.iterator();
        while (it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		}
        
        
	}

}

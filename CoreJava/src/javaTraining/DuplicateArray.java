package javaTraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= { "java" , "php", "selenium" , "java", "php"};

		
		
		 //Hash set
		 
		 Set b = new HashSet(); for (String name : a) { if (b.add(name) == false) {
		 
		 System.out.println("duplicat is" + name ); }
		 
		  }
		 
		 System.out.println("**************************************");
		 
		
		//Hash map
		
		    Map<String , Integer> c =new HashMap<String, Integer>();
		    for (String names : a) {
		    	
		   Integer count = c.get(names);
		   if (count == null) {
			   
			c.put(names, 1);
		}
		   else {
			   
			   c.put(names, ++count);
		   }
		                       }
		   
		   //iterate 
		        Set<Entry<String, Integer>> entry = c.entrySet();
		        for (Entry<String, Integer> ent : entry) {
		        	
		        	if (ent.getValue()>1) {
		        		
		        		System.out.println("duplicate" + ent.getKey());
						
					}
					
				}
				
			
		
	}

}

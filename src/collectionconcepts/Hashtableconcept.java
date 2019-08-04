package collectionconcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtableconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h1 = new Hashtable();
		h1.put(1,"kavin");
		h1.put(2,"jayanth");
		h1.put(3,"arun");
		System.out.println(h1.get(2));
		//to clone an object
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		System.out.println("values from h1" + h1);
		System.out.println("values from h2" + h2);
		h1.clear();
		System.out.println("values from h1" + h1);
		System.out.println("values from h2" + h2); 
		//contains value method
		Hashtable h3 = new Hashtable();
		h3.put("A","kavin");
		h3.put("B","jayanth");
		h3.put("C","arun");
		if(h3.containsValue("jayanth")) {
			System.out.println("values found");
		//enumeration/elements method tp print all the values
			Enumeration e = h3.elements();
			System.out.println("values from h3");
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
				//to print all the values using entry set
				Set m = h3.entrySet();
				System.out.println(m);
				//both objects are equal
				Hashtable h3a = new Hashtable();
				h3a.put("A","kavin");
				h3a.put("B","jayanth");
				h3a.put("C","arun");
				h3.equals(h3a);
				System.out.println("both values are equal");
				//to get hashcode value
				System.out.println("the hashcode value of h3a will be:" + h3a.hashCode());
				
				//it contains only unique values
				//it does not contain null key and null values
				//it is synchronized
				//stores the value on the basis of key value pair
				//key specified as an object----has code(32 bit integer number)-----value 
				
				
					
					
				}  
			}
		}
			

		
		
		

	}
	


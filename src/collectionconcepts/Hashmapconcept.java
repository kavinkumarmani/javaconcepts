package collectionconcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		hm.put(1,"KAVIN");
		hm.put(2,"ARUN");
		hm.put(3,"JAYANTH");
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));
		
		//to print all the values map.entry method should be used
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		hm.remove(2);
		System.out.println(hm);
		HashMap<Integer, employee> emp= new HashMap<Integer, employee>();
		employee e1 = new employee ("kavin", 25, "auto");
		employee e2 = new employee ("arun", 25, "eee");
		employee e3 = new employee ("jayanth", 25, "cse");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		//System.out.println(emp.get(2));
		for(Entry<Integer, employee> m : emp.entrySet()) {
			int key= m.getKey();
			employee e = m.getValue();
			System.out.println(key + "   info:");
			System.out.println(e.name+"  "+e.age+"  "+e.dept);
		}
	}
}
		//hashmap can be accessable by multiple threads and it is not synchronized
		//it contains only unique element
		//stores value on basis of key and value
		//it may have one null key and multiple null value
	

  
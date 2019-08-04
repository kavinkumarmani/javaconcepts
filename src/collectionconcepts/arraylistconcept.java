package collectionconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arraylistconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.get(2);
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		//to print all the values/for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			//using iterator method
			System.out.println("using iterator method");
			Iterator it = ar.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				ArrayList <employee> ar2= new ArrayList();
				employee e1= new employee("kavin", 25, "auto");
				employee e2= new employee("jayanth", 25, "cse");
				employee e3= new employee("arun", 25, "eee");
				ar2.add(e1);
				ar2.add(e2);
				ar2.add(e3);
				//using iterator
				System.out.println("using iterator");
				Iterator<employee> it1 = ar2.iterator();
				while(it1.hasNext()) {
					employee emp = it1.next();
					System.out.println(emp.name);
					System.out.println(emp.age);
					System.out.println(emp.dept);
					
					//addall method
					ArrayList ar4 = new ArrayList();
					ar4.add("kavin");
					ar4.add("jayanth");
					ar4.add("arun");
					ar4.add("venkat");
					

					ArrayList ar5 = new ArrayList();
					ar5.add("bharani");
					ar5.add("suresh");
					ar5.add("pavinthran");
					ar5.add("nataraj");
					
					ar4.addAll(ar5);
					System.out.println("@@@@@@@@@@@@@@@@@@@@@");
					ar4.removeAll(ar5);
					System.out.println(ar4.size());
					for(int t=0;t<ar4.size();t++) {
						System.out.println(ar4.get(t));
					}
					
					
					
					
					
				}
				
			}
		}
		
		

	}

}

package collectionconcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		LinkedList li = new LinkedList();
		li.add("kavin");
		li.add("arun");
		li.add("jayanth");
		System.out.println(li);
		li.addFirst("praveen");
		li.addLast("naveen");
		System.out.println(li);
		//set
		li.set(1, "change");
		System.out.println(li);
		li.get(1);
		System.out.println(li.get(1));
		//to print all the values in linked list
		//for loop
		System.out.println("using for loop");
		for(int n=0;n<li.size();n++) {
			System.out.println(li.get(n));
			//using advance for loop
			System.out.println("using advance for loop");
			//for(String str :li) {
				//system.out.println(str);
			//using iterator
			System.out.println("using iterator method");
			Iterator it = li.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			//using while
			int t = 0;
			while(li.size()>t) {
				System.out.println(li.get(t));
				t++;
			}
			
				
			}
			
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static char[] get(LinkedList li) {
		// TODO Auto-generated method stub
		return null;
	}

}

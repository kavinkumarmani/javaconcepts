package Javabasics;

public class callbyvalueandreferenceconcept {

	public static void main(String[] args) {
		callbyvalueandreferenceconcept obj = new callbyvalueandreferenceconcept();
		int x=23;
		int y=45;
		obj.check(x,y);//call by value or pass by value 
	
	}
		
		public int check(int a, int b){
			int c= a+b;
			return c;
			
		
		}

	}


package Javabasics;

public class finallyconcept {

	public static void main(String[] args) {
		division();
		

	}
	public static void division() {
		int i=10;
		try{
			System.out.println("inside try bblock");
			int k=i/0;
			
		}
		catch(ArithmeticException e){
			System.out.println("inside catch block");
			
		}
		finally {
			System.out.println("execute the code even any error occur");
		}
	}

}

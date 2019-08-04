package Javabasics;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40; 
		i[4]=50;
		System.out.println(i.length);
		System.out.println(i[3]);
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			
		}
		// we use object array to store different data type
		//object is a class
		
		Object obj[]=new Object[5]; 
		

	}

}

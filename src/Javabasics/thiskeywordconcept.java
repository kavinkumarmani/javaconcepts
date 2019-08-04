package Javabasics;

public class thiskeywordconcept {
	String name;
	int age;
	public thiskeywordconcept(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskeywordconcept obj= new thiskeywordconcept("tom",30);
	}

}

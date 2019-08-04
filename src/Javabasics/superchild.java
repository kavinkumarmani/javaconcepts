package Javabasics;

public class superchild extends superparent {
	
	public superchild() {
		super(10);
		System.out.println("superchild constructor");
		
	}
	public superchild(int i) {
		super(i);
		System.out.println("superchild constructor");
		
	}


	public static void main(String[] args) {
		superchild obj=new superchild(20);
	

	}

}

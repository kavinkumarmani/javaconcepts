package Javabasics;

public class twodimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[][]=new int[4][4];
		System.out.println(i.length);
		System.out.println(i[0].length);
		i[0][0]=10;
		i[0][1]=20;
		i[0][2]=30;
		i[0][3]=40;
		
		i[1][0]=50;
		i[1][1]=60;
		i[1][2]=70;
		i[1][3]=80;
		
		i[2][0]=90;
		i[2][1]=100;
		i[2][2]=110;
		i[2][3]=120;
		
		i[3][0]=130;
		i[3][1]=140;
		i[3][2]=150;
		i[3][3]=160;
		
		System.out.println(i[3][3]);
		//to print all the values use 2 for loop
		
		for(int row=0;row<i.length;row++) {
			for(int col=0;col<i[0].length;col++) {
				System.out.println(i[row][col]);
			}
		}

	}

}

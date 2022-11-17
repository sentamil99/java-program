package com.forloop;

public class Patternbrogrom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patternbrogrom pb=new Patternbrogrom();
		///pb.print12345();
		pb.print1234();
	}

	private void print1234() {
		// TODO Auto-generated method stub
		
		for(int row=5; row>=1; row--)
		{
			for(int num=5; num>=row; num--) 
			{
				System.out.print(num+" ");
			
			}
		System.out.println();
		}
	}

	private void print12345() {
		// TODO Auto-generated method stub
		
		for(int row=1; row<=5; row++)
		{
			for(int num=1; num<=6-row; num++) 
			{
				System.out.print(num+" ");
				
			}
		System.out.println();
		}
	}

}

package com.forloop;

public class Patternbrogrom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patternbrogrom pb=new Patternbrogrom();
		pb.print12345();//
		pb.print1234();
		pb.print3();
		pb.print1();
		pb.print2();
	}

	private void print2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=6-row;col++) 
			{
				System.out.print(1+" ");
			}System.out.println();
		}
		
	}

	private void print1() {
		// TODO Auto-generated method stub
		for(int row=0;row<=4;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print((row+col)+" ");
			}
			System.out.println();
		}
	}

	private void print5() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=6-row;col--) {
				System.out.print(row+" ");
		}
		System.out.println();}
	}

	private void print3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int num=1;num<=6-row; num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
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
				System.out.print(1+" ");
				
			}
		System.out.println();
		}
	}

}

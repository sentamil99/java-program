package com.forloop;

//import com.sun.swing.internal.plaf.synth.resources.synth;

public class Patternbrogrom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patternbrogrom pb=new Patternbrogrom();
		//pb.print12345();
		//pb.print1234();
	    //pb.print3();
		//pb.print1();
		//pb.print2();
	    //pb.print6();
	    //pb.print7();
		//pb.print8();
		//pb.print9();
		//pb.pattern1();
		//pb.pattern2();
		pb.pattern3();
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
		for(int col=1;col<=5-row;col++) {
			System.out.print(" "+ " "); 
		}
		for(int col=1;col<=row;col++) {
			System.out.print(1+ " ");
		}
		System.out.println();
			}
	}

	private static void pattern2() {
		// TODO Auto-generated method stubr
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+" ");
			}for(int col=1;col<=row;col++) {
				System.out.print(1+" ");
			}
			
			System.out.println();
		}
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print(col*row+" ");
			}
			System.out.println();
		}
	}

	private void print9() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=6-row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void print8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void print7() {
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=6-row;col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
	

	private void print6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void print2() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) 
		{
			for(int col=row;col>=1;col--) 
			{
				System.out.print(col+" ");
			}
			System.out.println();
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

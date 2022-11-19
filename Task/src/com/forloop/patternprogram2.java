package com.forloop;

public class patternprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternprogram2 bro=new patternprogram2();
		//bro.pattern1();ss
		//bro.pattern2();
		//bro.pattern3();
		//bro.pattern4();
		//bro.pattern5();
		//bro.pattern6();
		//bro.pattern7();
		//bro.pattern8();
		//bro.pattern9();
		bro.pattern10();
	}

	private void pattern10() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" "+" ");
			}
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern9() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	private void pattern8() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(col+" ");
			}
			System.out.print(1);
			System.out.println();
			}
	}

	private void pattern7() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(col+" ");
			}	
			System.out.println();
			}
	}

	private void pattern6() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}	
			System.out.println();
			}

	}

	private void pattern5() {
		for(int row=5;row>=1;row--) {
			for(int col=row;col<=5;col++) {
				System.out.print(col+" ");
			}	
			System.out.println();
			}
		
		}	
	

	private void pattern4() {
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern3() {
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern2() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	

	private void pattern1() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}

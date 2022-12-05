package com.exception;

import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling eh=new ExceptionHandling();
		try {
			eh.tryCatch();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void tryCatch() throws FileNotFoundException{
		// TODO Auto-generated method stub
		//System.out.println(10/0);
		String name="tamil";
		int[] ar=new int[3];
	//	ar[10]=10;
		
		
		try {
			int[] ar1=new int[3];
//			ar[10]=10;
//			System.out.println(10/0);
//			System.out.println(name.charAt(10));
			
			
		} 
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("not given 0");
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("your index greater then");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("your array index greater then");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("i am finally");
		}
		
		System.out.println("hi");
	}

}

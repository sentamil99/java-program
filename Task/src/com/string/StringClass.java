package com.string;

public class StringClass {

	public static void main(String args[]) {
		StringClass sc = new StringClass();
		String name = "tamil123";
		String na = "i am tamil";
		System.out.println(na.toLowerCase());
		String d = new String("hi");
		System.out.println(na.contains("tamils"));
		// length
		// equals
		// charAt
		/*
		 * System.out.println(name); for(int i=name.length()-1;i>=0;i--) {
		 * System.out.print(name.charAt(i)); }
		 * 
		 * String rev=""; for(int i=na.length()-1;i>=0;i--) { rev=rev+na.charAt(i); }
		 * //System.out.println(rev); if(na.equals(rev)) {
		 * System.out.println("palindrome"); } else{
		 * System.out.println(" not palindrome"); }
		 * 
		 */
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='a' && name.charAt(i)<'z')
			System.out.print(name.charAt(i));
		}
		
	}

}

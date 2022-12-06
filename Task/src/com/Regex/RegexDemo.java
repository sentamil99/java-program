package com.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.forloop.patternprogram2;

public class RegexDemo {

	public static void main(String arg[]) {
		RegexDemo rd=new RegexDemo();
		//rd.regex1();
		//rd.regex2();
		rd.regex3();
		//rd.regex4();
		//rd.regex5();
		//rd.regex6();
	}

	private void regex6() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anyting here:");
		String input=sc.nextLine();
		Pattern patternObj=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		
		Matcher matcherObj=patternObj.matcher(input);
		while(matcherObj.find()) {
			System.out.println(matcherObj.group());
		}
	}

	private void regex5() {
		// TODO Auto-generated method stub
		String input="senthamil095@gmail.com";
		//Pattern patternObj=Pattern.compile("[a-z]");
		//Pattern patternObj=Pattern.compile("[0-9]");
		//Pattern patternObj=Pattern.compile("[a-z0-9]");
		Pattern patternObj=Pattern.compile("[^a-z0-9]");

		
		
		Matcher matcherObj=patternObj.matcher(input);
		while(matcherObj.find()) {
			System.out.print(matcherObj.group());
		}
	}

	private void regex4() {
		// TODO Auto-generated method stub
		String input ="abcd abcd abcd abc  bc abc abcd";
		Pattern patternObj=Pattern.compile("[^abc]");
		Matcher matcherObj=patternObj.matcher(input);
		while(matcherObj.find()) {
			System.out.print(matcherObj.group());
		}
	}

	private void regex3() {
		// TODO Auto-generated method stub
		String input ="abcd abcd abcd abc  bc abc abcd";
		Pattern patternObj=Pattern.compile("[abc]");
		Matcher matcherObj=patternObj.matcher(input);
		while(matcherObj.find()) {
			System.out.print(matcherObj.group());
		}
	
	}

	private void regex2() {
		// TODO Auto-generated method stub
		String input ="abcd abcd abcd abc  bc abc abcd";
		Pattern patternObj=Pattern.compile("abc");
		Matcher matcherObj=patternObj.matcher(input);
		while(matcherObj.find()) {
			System.out.println(matcherObj.group());
		}
	}

	private void regex1() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abc bc abc";
		Pattern patternObj=Pattern.compile("abc");
		Matcher matcherObj=patternObj.matcher(input);
		System.out.println(matcherObj.find());
	}
}

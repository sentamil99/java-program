package com.collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collectionDemo cd =new collectionDemo();
		//cd.Linkedlist();
		//cd.Hashset();
		//cd.LinkedHash();
		//cd.treeset();
		//cd.learn_iteration();
		//cd.iterationMethod();
		//cd.SumofNumber();
		//cd.RemoveDuplicate();
        //cd.PrintDuplicate();
		//cd.yesOrNo();
		cd.PrintIntegerOnly();
	}

	private void PrintIntegerOnly() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("aa");
		al.add(5.8f);
		al.add(459.2d);
		al.add(true);
		al.add(18);
		for(Object ob:al) {
			try {
			Integer i=(Integer) ob;
			System.out.println(i);
			} catch (Exception e) {
				//System.out.println("check");
			}
		}
	}

	private void yesOrNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("continue or not");
		String str=sc.next();
		ArrayList al=new ArrayList();
        while(str.equals("y")) {
        	System.out.println("enter number");
        	Integer no=sc.nextInt();
        	al.add(no);
    		System.out.println("continue or not");
    		str=sc.next();        	
        }
        System.out.println(al);

	}

	private void PrintDuplicate() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(5);
		al.add(5);
		al.add(6);
		al.add(6);
		al.add(13);
		LinkedHashSet all=new LinkedHashSet(al);
		for(Object ob:al) {
			boolean dup=all.add(ob);
			if(dup==false) {
			System.out.println(ob);
			}
		}
	}

	private void RemoveDuplicate() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(18);
		al.add(18);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(54);
		System.out.println(al);
		LinkedHashSet all=new LinkedHashSet(al);
		System.out.println(all);
	}

	private void SumofNumber() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(18);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(54);
		int total=0;
		for(Object ob:al) {
			Integer i=(Integer)ob;
			total+=i;
		}
		System.out.println(total);
	}

	private void iterationMethod() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(18);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(54);
		for(Object ob:al) {
			Integer i=(Integer)ob;
			if(i%6==0) {
		System.out.println(ob);
		}
		}
				
	}

	private void learn_iteration() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(Object ob:al) {
		System.out.println(ob);
		}
				
	}

	private void treeset() {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("vikram");
		ts.add("mani");
		ts.add("sam");
		ts.add("arun");
		ts.add("ram");
		System.out.println(ts);
	}

	private void LinkedHash() {
		// TODO Auto-generated method stub
		LinkedHashSet al=new LinkedHashSet();
		//LinkedHashSet al=new HashSet();
		HashSet al2=new HashSet();
		al.add(10);
		al.add("virat");
		al.add(true);
		al.add(5.6f);
		al.add('a');
		System.out.println(al);
		//System.out.println(al.get(2));
		System.out.println(al.contains(10));
		al.remove(3);
		System.out.println(al);
		al2.add("sakthi");
		al2.add("sakthivel");
		//al2.removeAll(al2);
		System.out.println(al2);
		al2.addAll(al);
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
	}
	

	private void Hashset() {
		// TODO Auto-generated method stub
		HashSet al=new HashSet();
		HashSet al2=new HashSet();
		al.add(10);
		al.add("virat");
		al.add(true);
		al.add(5.6f);
		al.add('a');
		System.out.println(al);
		//System.out.println(al.get(2));
		System.out.println(al.contains(10));
		al.remove(3);
		System.out.println(al);
		al2.add("sakthi");
		al2.add("sakthivel");
		//al2.removeAll(al2);
		System.out.println(al2);
		al2.addAll(al);
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
	}
	

	private void Linkedlist() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		
		al.add(10);
		al.add("virat");
		al.add(true);
		al.add(5.6f);
		al.add('a');
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains(10));
		al.remove(3);
		System.out.println(al);
		al2.add("sakthi");
		al2.add("sakthivel");
		//al2.removeAll(al2);
		System.out.println(al2);
		al2.addAll(al);
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
	}

}

package com.array;

import java.util.Scanner;


public class ArrayTask {

	private Object get_smallest_And_Secont;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayTask at=new ArrayTask();
		int a[]= {10,20,30,40,50};
		//at.printArray(a);
		//at.reverseArray(a);
		//at.get_Biggest_And_Second_Biggest();
		//at.get_smallest_And_Secontsmallest_();
		//at.LinearSearch();
		//at.index_of_given_num();
		//at.leaner();
		//at.oddIndex();
		//at.evenIndex();
		//at.getMark();
		//at.getBiggest();
		//at.getSmallest();
		//at.SecondBiggestNO();
		//at.SecondSmallestNo();
		at.addofoddindex();
	}
	
	
	private void addofoddindex() {
		int ar[]= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(i%2!=0) {
				sum+=ar[i];
			}
		}System.out.println(sum);
	}


	private void SecondSmallestNo() {
		int ar[]= {41,75,34,12,32,18};
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small1) {
				small2=small1;
				small1=ar[i];
			}
			else if(ar[i]<small2) {
				small2=ar[i];
			}
		}
		System.out.println("Smallest NO Is:"+small1);
		System.out.println("Smallest NO Is:"+small2);

	}


	private void SecondBiggestNO() {
	int ar[]= {54,78,34,66,98};
	int big1=Integer.MIN_VALUE;
	int big2=Integer.MIN_VALUE;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>big1) {
			big2=big1;
			big1=ar[i];
		}
		else if(ar[i]>big2) {
			big2=ar[i];
		}
	}
	System.out.println("Biggest no is: "+ big1);
	System.out.println("Biggest no is: "+ big2);

	}


	private void getSmallest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of days");
		int day=sc.nextInt();
		int temp[]=new int[day];
		int small=Integer.MAX_VALUE;
		int big=Integer.MIN_VALUE;
		for(int i=0;i<temp.length;i++) {
			System.out.println("Enter temperature: ");
			temp[i]=sc.nextInt();
			if(temp[i]<small) {
				small=temp[i];
			}
			if(temp[i]>big) {
				big=temp[i];
			}
		}
		System.out.println("loest temp:"+small);
		System.out.println("biggest temp:"+big);
	}


	private void getBiggest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subject");
		int sub=sc.nextInt();
		int mark[]=new int [sub];
		int big=0;
		for(int i=0;i<mark.length;i++) {
			System.out.println("Enter mark");
			mark[i]=sc.nextInt();
			if(mark[i]>big) {
				big=mark[i];
			}
		}System.out.println("Biggest no:"+big);
		
	}


	private void getMark() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of subject");
		int sub=sc.nextInt();
		int mark[]=new int [sub];
		int total=0;
		for(int i=0;i<mark.length;i++) {
			System.out.print("enter mark: ");
			mark[i]=sc.nextInt();
			total+=mark[i];
		}
		System.out.println("Total: "+total);
		System.out.println("Average "+total/mark.length);
	}


	private void evenIndex() {
		int ar[]= {10, 20,30,40,50};
		for(int i=0;i<ar.length;i+=2) {
			System.out.print(ar[i]+" ");
			System.out.println("index"+i);
		}
	}


	private void oddIndex() {
		int ar[]= {10, 20,30,40,50};	
		for(int i=1;i<ar.length;i+=2) {
			System.out.print(ar[i]+" ");
			System.out.println("index"+i);
		}
	}


	private void leaner() {
		int ar[]= {10,20,30,40,50};
		int count=0;
		int key=30;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				count++;
			}
		}System.out.println("count"+count);
		
	}


	private void index_of_given_num() {
		int ar[]= {12,13,14,15,16};
		int intex=1;
		for(int i=0;i<ar.length;i++) {
			if(i==intex) {
				System.out.println("intex value"+ar[i]);
			}
		}
		
	}


	private void LinearSearch() {
		int ar[]= {10,20,30,40,50};
		int key=40;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				System.out.println("Key value" + key);
			}
		}
		
	}


	private void get_smallest_And_Secontsmallest_() {
		int ar[]= {10,15,20,25,30};
		int small = Integer.MAX_VALUE,small2 =Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small) {
				small2=small;
				small=ar[i];
				}
				else if(ar[i]<small2){
					small2=ar[i];
				}	
				}System.out.println("smallest_value is "+small+" Secontsmallest value is "+ small2); 
			}
		
	
	private void get_Biggest_And_Second_Biggest() {
		int[] ar = {-15,-12,-14,-18}; 
		int big = Integer.MIN_VALUE, big2 = Integer.MIN_VALUE; 
		for(int i=0; i<ar.length; i++)
		{
		if(ar[i]>big)		{
			big2 = big; 
			big = ar[i]; 	}
		else if(ar[i]>big2){
			big2 = ar[i]; 
			}
		}
System.out.println("Biggest value is "+ big + " Second biggest value is "+ big2);
	}
	private void reverseArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

	private void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

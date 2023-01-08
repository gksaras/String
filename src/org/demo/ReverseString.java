package org.demo;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sequence:");
	String s=sc.nextLine();
	int n=s.length(); 
	String st="";
	for(int i=0;i<n;i++)
	{
	char c=s.charAt(i);
	st=c+st;
	}
	System.out.println(st);
	}
}

package org.demo;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word:");
	String s=sc.nextLine(); 
	String st="";
	//String lc=s.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
	st=c+st;
	}
	if(st.equals(s))
	{
	System.out.println(s+" is a Palindrome");
	}
	else
	{
	System.out.println(s+" is not a Palindrome");
	}
	}
}

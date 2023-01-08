package org.test;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
	String str;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	str=sc.nextLine();
	//System.out.println(str);
	String rev ="";
	String temp = str;
	for (int i = temp.length()-1; i >= 0; i--) {
		rev+=temp.charAt(i);
	}
	System.out.println(rev);
	if (str.equals(rev)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
	}
}

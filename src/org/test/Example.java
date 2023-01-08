package org.test;
public class Example {
	public static void main(String[] args) {
		String s1="GreensTechnolgy";
		String s2="SeleniumAutomationTool";
		String s3="velmurugan";
		String s4="j a v a p r o g r a m";
		String s5="9095484678";
		// To find the length of String
		System.out.println("Length of the strings");
		int l1 = s1.length();
		System.out.println(l1);
		int l2 = s2.length();
		System.out.println(l2);
		int l3 = s3.length();
		System.out.println(l3);
		int l4 = s4.length();
		System.out.println(l4);
		int l5 = s5.length();
		System.out.println(l5);
		// To find the index of particular character
		System.out.println("Index of the character in strings");
		int i1 = s1.indexOf('o');
		System.out.println(i1);
		int i2 = s2.indexOf('o');
		System.out.println(i2);
		int i3 = s3.indexOf('n');	
		System.out.println(i3);
		int i4 = s4.lastIndexOf(' ');
		System.out.println(i4);
		int i5 = s5.indexOf('8');
		System.out.println(i5);
		//To find the particular character in a string based on index
		System.out.println("Particular character of a string");
		char c1 = s1.charAt(9);
		System.out.println(c1);
		char c2 = s2.charAt(11);
		System.out.println(c2);
		char c3 = s3.charAt(4);
		System.out.println(c3);
		char c4 = s4.charAt(8);
		System.out.println(c4);
		char c5 = s5.charAt(8);
		System.out.println(c5);
		}
}

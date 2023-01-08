package org.test;
public class QuestionFour {
	//To check whether the two strings are equal With Case
	private void example1() {
		String s1="Java";
		String s2="Java";
		boolean  a= s1.equals(s2);
		System.out.println(a);
	}
	private void example2() {
		String s1="Java";
		String s2="java";
		boolean b = s1.equals(s2);
		System.out.println(b);
	}
	private void example3() {
		String s1="Green Technology";
		String s2="GreenTechnology.";
		boolean c = s1.equals(s2);
		System.out.println(c);
	}
	//To check whether the two strings are equal Without Case
	private void example4() {
		String s1="Java";
		String s2="java";
		boolean d = s1.equalsIgnoreCase(s2);
		System.out.println(d);
	}
	private void example5() {
		String s1="Nisha";
		String s2="nisha";
		boolean e = s1.equalsIgnoreCase(s2);
		System.out.println(e);
	}
		public static void main(String[] args) {
			QuestionFour q=new QuestionFour();
			q.example1();
			q.example2();
			q.example3();
			q.example4();
			q.example5();
		}	
	}

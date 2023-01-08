package org.test;

public class QuestionNine {
	public static void main(String[] args) {
		//Question 9.1
		String s1="Welcome to class java";
		boolean sw1 = s1.startsWith("welcome");
		System.out.println(sw1);
		//Question 9.2
		String s2="Hai i am nisha";
		boolean sw2 = s2.startsWith("welcome");
		System.out.println(sw2);
		//Question 9.3
		boolean ew1 = s1.endsWith("class");
		System.out.println(ew1);
		//Question 9.4
		boolean ew2 = s1.endsWith("java");
		System.out.println(ew2);
		//Question 9.5
		boolean e1 = s1.isEmpty();
		System.out.println(e1);
		//Question 9.6
		String s3="";
		boolean e2 = s3.isEmpty();
		System.out.println(e2);
	}

}

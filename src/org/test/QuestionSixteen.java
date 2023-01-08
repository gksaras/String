package org.test;

/*(read in the String str);
str = str.replaceAll("[aeiou]", "?");
System.out.println(str);*/

public class QuestionSixteen {
	public static void main(String[] args) {
		String s="Welcome";
		String r = s.replaceAll("[aeiou]", "@");
		System.out.println(r);
	}
}

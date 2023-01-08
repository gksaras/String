package org.test;

public class QuestionFourteen {
	public static void main(String[] args) {
		String s="America";
		int v=0,c=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
				v++;
				}
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				v++;
			}
			else {
				c++;
			}
		}
		System.out.println(v);
		System.out.println(c);
	}
}

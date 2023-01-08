package org.test;

public class QuestionTwelve {
	public static void main(String[] args) {
		String s="Hello welcome to java class";
		String[] x = s.split("l");
		
		//System.out.println(s.length());
		//System.out.println(x.length);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+'\n');
		}
		System.out.println("");
	}
}

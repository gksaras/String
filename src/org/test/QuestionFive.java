package org.test;

public class QuestionFive {
	private void exampleOne() {	

		String s="velmurugan451@gmail.com";
		boolean c = s.contains("@");
		if(c==true) {
			System.out.println("Valid Mail => "+s);
		}else {
			System.out.println("Invalid");
		}
	}
	private void exampleTwo() {
		String s="5-35-2a,venkatesh nivas,Aruppukottai";
		boolean c = s.contains("pincode");
		if(c==true) {
			System.out.println("Valid Address => "+s);
		}else {
			System.out.println("Invalid");
		}
	}
	private void exampleThree() {
		String s="Nishakerala24@gmail.com";
		boolean c = s.contains("@");
		System.out.println(c);
	}
	private void exampleFour() {
		String s="9876543120";
		int flag=1;
		if(s.length()==10) {
			for (int i = 0; i < s.length(); i++) { 
				char ch = s.charAt(i);
				if(ch >= 48 && ch <= 57)
				{
					flag=1;
				}else {
						flag=2;
						break;
		               }
				}
		}
			else {
			flag=2;
		}
		if(flag==1) {
			System.out.println("valid");
        }
	    else {
        	System.out.println("Invalid");
        }
	}
	
		public static void main(String[] args) {
			QuestionFive q=new QuestionFive();
			q.exampleOne();
			q.exampleTwo();
			q.exampleThree();
			q.exampleFour();
        }
}
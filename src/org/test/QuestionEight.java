package org.test;

public class QuestionEight {
	private void egOne() {
		String s="NISHANTHI";
		String l = s.toLowerCase();
		System.out.println(l);
	}
	private void egTwo() {
		String s="nishanthi";
		String l = s.toUpperCase();
		System.out.println(l);
		
	}
	private void egThree(StringBuffer str) {
	    {
	        int ln = str.length();
	 
	        // Conversion using predefined methods
	        for (int i = 0; i < ln; i++) {
	            Character c = str.charAt(i);
	            if (Character.isLowerCase(c))
	                str.replace(i, i + 1,
	                            Character.toUpperCase(c) + "");
	            else
	                str.replace(i, i + 1,
	                            Character.toLowerCase(c) + "");
	        }
	    }
	}
	private void egFour() {
		String s="Greens Technology 123";
		int l=0,u=0,n=0,sp=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			//65->'A' ,90->'Z' ASCII value of Capital A to Z
			if(ch >= 65 && ch <= 90) {
				u++;
			}
			//97->'a' ,120->'z' ASCII value of small a to z
			else if(ch >= 97 && ch <= 120){
				l++;
			}
			//48->'0' ,57->'9' ASCII  value of numeric value 0 to 9
			else if(ch >= 48 && ch <= 57) {
				n++;
			}
			else {
				sp++;
			}
		}
		System.out.println(u);
		System.out.println(l);
		System.out.println(n);
		System.out.println(sp);
	}
	public static void main(String[] args) {
		QuestionEight q=new QuestionEight();
		q.egOne();
		q.egTwo();
		StringBuffer str= new StringBuffer("WelcomE");
		// Calling the Method
		q.egThree(str);
		System.out.println(str);
		q.egFour();
	}
}

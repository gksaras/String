package org.test;

public class StringExamples {
	
	public static void main(String[] args) {
		
	StringBuilder a = new StringBuilder("welcome to java");
	System.out.println(a);
	for (int i = 0; i < a.length(); i++) {
		if (a.charAt(i) >= 97 && a.charAt(i) <= 122) { // 97 to 122 small letters
			int upper = (int)a.charAt(i) - 32; // small letter to capital  letter
			a.setCharAt(i, (char)upper);
		}
	}
	System.out.println(a);
	
	System.out.println();
	
	StringBuilder b = new StringBuilder("GREENS TECHNOLOGIES");
	System.out.println(b);
	for (int i = 0; i < b.length(); i++) {
		if (b.charAt(i) >= 65 && b.charAt(i) <= 90) { // 65 to 90 capital letters
			int lower = (int)b.charAt(i) + 32; // capital letter to small letter
			b.setCharAt(i, (char)lower);
		}
	}
	System.out.println(b);
	
	System.out.println();
	
	// to count upper,lower,numeric,special char and space of String
	int upperCase = 0,lowerCase = 0,number = 0,specialCharacter = 0,space = 0;
	
	StringBuilder c = new StringBuilder("Bring me Thanos @ 21");
	System.out.println(c);
	for (int i = 0; i < c.length(); i++) {
		char ch = c.charAt(i);
		//65->'A' ,90->'Z' ASCII value of Capital A to Z
		if(ch >= 65 && ch <= 90) {
			upperCase++;
		}
		//97->'a' ,120->'z' ASCII value of small a to z
		else if(ch >= 97 && ch <= 120){
			lowerCase++;
		}
		//48->'0' ,57->'9' ASCII  value of numeric value 0 to 9
		else if(ch >= 48 && ch <= 57) {
			number++;
		}
		else if (ch == ' ') {
			space++;
		}
		else {
			specialCharacter++;
		}	
	}
	System.out.println(upperCase);
	System.out.println(lowerCase);
	System.out.println(number);
	System.out.println(space);
	System.out.println(specialCharacter);
	
	System.out.println();
	
	// Remove Junk in a String
	String d = "@#$%*() testing ()&^%! Selenium &&&& java ^&* 123";
	
	d = d.replaceAll("[^a-z,A-Z,0-9]", " ");
	System.out.println(d);
	
	System.out.println(d.trim());
	
	}
}

package org.test;

public class QuestionFifteen {
	public static void main(String[] args) {
		String s="Welcome to java class @123";
		int lowerCase=0,upperCase=0,number=0,space=0,specialCharacter=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
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
	}

}

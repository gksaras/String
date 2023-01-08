package org.test;

public class QuestionSix {
	public static void main(String[] args) {
		String s="90956edf43";
		int flag=1;
		if(s.length()==10) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch >= 48  && ch <= 57) {
				flag=1;
				}else{
					flag=2;
					break;
				}
			}
		}else {
			flag=2;
		}
		if(flag==1)
		{
			System.out.println("valid => "+s);
		}
		else {
			System.out.println("Invalid => "+s);
		}
	}
}
	

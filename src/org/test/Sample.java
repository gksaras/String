package org.test;

public class Sample {
	
	public static void main(String[] args) {
		
		// String is a predefined class which is presented in java.lang package
		
		String s="Java Application";
		//String length count every character from 1 to n
		
		int l = s.length();
		System.out.println(l);
		
		char c = s.charAt(0);
		System.out.println(c);
	
		int i = s.indexOf('a');
		System.out.println(i);
		
		int li = s.lastIndexOf('a');
		System.out.println(li);
		
		boolean e = s.isEmpty();
		System.out.println(e);
		
		boolean sw = s.startsWith("Ja");
		System.out.println(sw);
		
		boolean ew = s.endsWith("on");
		System.out.println(ew);
		
		boolean ct = s.contains("ava");
		System.out.println(ct);
		
		CharSequence x = s.subSequence(5, 8);  // J a v a   A p p l i  c  a  t  i  o  n
		System.out.println(x);				   // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		
		String sub = s.substring(0);
		System.out.println(sub);
		
		String subst = s.substring(0, 5);
		System.out.println(subst);
		
		String a="Nia";
		String b="nisha";
		int cmp = a.compareTo(b);
		System.out.println(cmp);
		int cmpToIgnoreCase = a.compareToIgnoreCase(b);
		System.out.println(cmpToIgnoreCase);
	}
}

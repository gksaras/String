package org.test;

public class LiteralString {

	public static void main(String[] args) {
		
		// String Literal => immutable - can't be changed						// Immutable => non-changable
		// Stored inside the heap memory(String pool/String constant)			// same as literal string
		// Eg: String a = "Welcome";											// String class (concat)
		// In case of duplicate - shares same memory location
		
		String a = "greens technologies";
		String b = "String in Java";

		System.out.println(a);
		System.out.println(b);
		
		String c = a.concat(b);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		//System.out.println(c=a.concat(b));
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		System.out.println(a.charAt(0));
		System.out.println(b.charAt(0));
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(a.replace("greens", "besant"));
		System.out.println(b.replace("Java", "python"));
		
		System.out.println(a.contains("tech"));
		System.out.println(b.contains("in"));
		
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		System.out.println(a.endsWith("es"));
		System.out.println(b.endsWith("va"));
		
		System.out.println(a.startsWith("be"));
		System.out.println(b.startsWith("St"));
		
		System.out.println(a.substring(0,5));
		System.out.println(b.substring(6));
		
		char[] charArray = a.toCharArray();
		for (char ch : charArray) {
			System.out.println(ch);
		}
		
		String d = "   Java Application    ";
		System.out.println(d.length());
		System.out.println(d.trim());
		System.out.println(d.trim().length());
	}
}

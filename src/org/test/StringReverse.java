package org.test;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// StringBuilder => Non-literal and mutable,non-thread safe,fast and asynchronous
		StringBuilder str = new StringBuilder("SMOOTH LIKE BUTTER");
		System.out.println(str);
		
		StringBuilder rev = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		System.out.println(rev);
		
		System.out.println();
		
		// String Reverse using Literal String and immutable
		// 1. using string concatenation operation
		String a = "Jack Sparrow";
		String b = "";
		System.out.println(a);
		for (int i = a.length()-1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		System.out.println(b);
		System.out.println();
		
		// 2. using character array
		String c = "Harry Potter";
		String d = "";
		System.out.println(c);
		char[] charArray = c.toCharArray();
		for (int j = charArray.length-1; j >= 0; j--) {
		d = d + charArray[j];
		}
		System.out.println(d);
		System.out.println();
		
		// 3. using StringBuffer => thread safe,synchronous and slow/Non-Literal String - mutable 
		String e = "Doctor Strange";
		System.out.println(e);
		StringBuffer sb = new StringBuffer(e);
		sb.reverse();
		System.out.println(sb);
		System.out.println();
		
		// Reverse each word in a string using literal string
		String s = "Burn it Down";
		System.out.println(s);
		String[] words = s.split(" "); // to split string into words
		System.out.println(Arrays.toString(words));
		String r = "";
		for (String w : words) 
		{
			String rw = "";
			
			for (int j = w.length()-1; j >= 0; j--) {
				rw = rw + w.charAt(j);
			}
			r = r + rw +" ";
		}
		System.out.println(r);
		System.out.println();
		
		// Reverse each word using Non-Literal String=>StringBuilder-mutable,non-thread safe,fast and asynchronous
		String st = "Bigg Boss";
		System.out.println(st);
		String[] split = st.split("\\s");
		System.out.println(Arrays.toString(split));
		String strev = "";
		for (String wd : split) {
			StringBuilder sbd = new StringBuilder(wd);
			sbd.reverse();
			strev = strev + sbd.toString()+" ";
		}
		System.out.println(strev);
	}
}

package org.test;

public class NonLiteralString {
	
	// Non-Literal String - mutable => changable				// Mutable - changable
	// stored in heap memory									// StringBuffer/StringBuilder class(append)
	// eg: String s = new String("Welcome");					// value of string is changable
	// In case of duplicate - shares different memory location  // while join or any action perform it shares first string memory value
	public static void main(String[] args) {					// First String and Concat String shares same memory
																
		String s = new String("Welcome");						// StringBuffer			  | StringBuilder			
		System.out.println(s);									// synchronous(one by one)|	Aysynchronous(parallel)	
		System.out.println(s.hashCode());						// Thread safe			  |	Non-Thread safe
																// slow					  |	fast
		StringBuffer buffer = new StringBuffer("Java\t");
		System.out.println(buffer);
		
		System.out.println(buffer.append("Application\t"));
		// to insert between String =>buffer.insert(index,str)
		
		System.out.println(buffer.insert(4, "\tStringBuffer"));
		
		System.out.println(buffer.replace(0, 4, "john"));
		
		System.out.println(buffer.delete(0, 4));
		
		System.out.println(buffer.reverse());

		buffer.setCharAt(0, 'Z');
		System.out.println(buffer);
		
		StringBuffer strbuffer = new StringBuffer();
		System.out.println(strbuffer.capacity());
		strbuffer.insert(0, "Java is my favourite language");
		System.out.println(strbuffer);
		System.out.println(strbuffer.capacity());
		
		StringBuffer a = new StringBuffer("java");
		StringBuffer b = new StringBuffer("python");
		StringBuffer c = new StringBuffer("java");
		StringBuffer d = b.append(c);
		// b and c shares same memory location
		System.out.println(a.hashCode());  
		System.out.println(b.hashCode()); 
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}
}

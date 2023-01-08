package org.test;

import java.util.Scanner;

public class CharacterDuplicate {
	
	public static void main (String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the word");
	String st=sc.nextLine();
	
	int n = st.length();
	
	char c[]=st.toCharArray();

	int count=0;
	
	for( int i=0;i<n;i++ )
	{
	for( int j=i+1;j<n;j++ )  // j = 3 ; 3 < 4 ; j++
	{
		if ( c[i]==c[j] )     // j == a       
		{
		System.out.println(c[i]+" ");
		count++;
		}
	}
	}
	System.out.println(count);
}
}
package org.test;

import java.util.Scanner;

public class WordCount {
		public static void main ( String args[] )
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String st=sc.nextLine();
		System.out.println("Enter the word to check whether Occured:");
		String str=sc.nextLine();
		
		String sp[]=st.split(" ");
		//System.out.println(sp);
		int count=0;
		for( int i=0;i<sp.length;i++ )
		{
			if ( str.equals(sp[i]) )
			{
			count++;
			}
		}
		System.out.println("The word occurs at "+count+" times");
		}
}

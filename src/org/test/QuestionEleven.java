package org.test;

public class QuestionEleven {
	private void egOne() {
		String s1="Nisha";
		String s2="Nisha";
		System.out.println("Literal String");
		System.out.println("==============");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
	private void egTwo() {
		StringBuffer s1=new StringBuffer("Nisha");
		StringBuffer s2=new StringBuffer("Nisha");
		System.out.println("Non Literal String");
		System.out.println("==================");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
	private void egThree() {
		String s1="Nisha";
		String s2="Rengan";
		System.out.println("Immutable String");
		System.out.println("================");
		System.out.println(s1+" => "+System.identityHashCode(s1));
		System.out.println(s2+" => "+System.identityHashCode(s2));
		String s3=s1.concat(s2);
		System.out.println(s3+" => "+System.identityHashCode(s3));
	}
	private void egFour() {
		StringBuffer s1=new StringBuffer("Nisha");
		StringBuffer s2=new StringBuffer("Rengan");
		System.out.println("Mutable String");
		System.out.println("==============");
		System.out.println(s1+" => "+System.identityHashCode(s1));
		System.out.println(s2+" => "+System.identityHashCode(s2));
		StringBuffer s3=s1.append(s2);
		System.out.println(s3+" => "+System.identityHashCode(s3));
	}
	public static void main(String[] args) {
		QuestionEleven q=new QuestionEleven();
		q.egOne();
		q.egTwo();
		q.egThree();
		q.egFour();
	}

}

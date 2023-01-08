package org.test;
public class QuestionSeven {
	private void example1() {
		String s="Welcome to class java";
		String r = s.replace("java", "sql");
		System.out.println(r);
	}
	private void example2() {
		String s="Greens Adayar";
		String r = s.replace("Adayar", "Omr");
		System.out.println(r);
	}
	private void example3() {
		String s="Welcome to java class";
		String r = s.replace(' ', '#');
		System.out.println(r);
	}
	private void example4() {
		String s="Nishakerala24@gmail.com";
		boolean c = s.contains("gmail");
		if (c==true) {
			String r = s.replace("gmail", "yahoo");
			System.out.println(r);
		}
	}
	private void example5() {
		String s="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		boolean c = s.contains("pincode");
		if(c==true) {
			String r = s.replace("pincode-626101", "");
			System.out.println(r);
		}
	}
	public static void main(String[] args) {
		QuestionSeven q=new QuestionSeven();
		q.example1();
		q.example2();
		q.example3();
		q.example4();
		q.example5();
	}
}

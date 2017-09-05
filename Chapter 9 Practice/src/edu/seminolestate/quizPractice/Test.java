package edu.seminolestate.quizPractice;

public class Test { 
  private int age;

  public static int square(int n) { 
    return n * n;
  }

  public int getAge() {
      return age;
  }


	public static void main (String[] args) {
		Test tst = new Test();
		System.out.println("square: " + tst.square(10));
		System.out.println("getAge: " + tst.getAge());
	}

}
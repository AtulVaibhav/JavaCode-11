package com.exceptionhandling;

public class ExceptionIntro {
   public void printStatement(){
	   System.out.println("statement1");
	   System.out.println("statement2");
	   int result = 12/0;
	   System.out.println("statement3");
	   System.out.println("statement4");
   }
	public static void main(String[] args) {
		ExceptionIntro obj = new ExceptionIntro();
		obj.printStatement();

	}

}

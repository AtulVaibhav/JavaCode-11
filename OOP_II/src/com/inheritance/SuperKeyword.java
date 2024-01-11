package com.inheritance;

class SuperClass
{
	
	
	SuperClass(){
		System.out.println("Superclass  object created");
	}
}

class SubClass extends SuperClass{
	SubClass(){
	     this(10);
		System.out.println("Subclass object created");
	}
	SubClass(int a){
		super();
		System.out.println("SubClass parameterized constructor");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();

	}

}

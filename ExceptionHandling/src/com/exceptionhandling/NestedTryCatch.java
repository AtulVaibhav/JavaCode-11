package com.exceptionhandling;

public class NestedTryCatch {
	public static void m1(int a,int b,String str){
		try{
			System.out.println("Inside outer try block");
			int result = a/b;
			System.out.println(result);
			try{
				System.out.println("Inside inner try block");
				System.out.println(str.length());
			}catch(ArithmeticException e){
				System.out.println("Exception "+e.getClass()+" handled in inner catch block");
			}
		}catch(Exception e){
			System.out.println("Exception "+e.getClass()+" handled in outer catch block");
		}
		
		System.out.println("Outside nested try-catch");
	}

	public static void main(String[] args) {
		//m1(12,4,"Hello");
		//m1(12,0,"Java");
		m1(12,4,null);

	}

}

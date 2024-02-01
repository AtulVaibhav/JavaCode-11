package com.exceptionhandling;

public class Try_Catch_II {
    public static void m1(){
    	int i=12/0;
    	System.out.println(i);
    	try{
    		String str = "Java";
    		System.out.println(str.charAt(5));
    	}catch(Exception e){
    		System.out.println("Exception handled");
    	}
    	System.out.println("Out of trycatch");
    }
	
	
	public static void main(String[] args) {
		m1();

	}

}

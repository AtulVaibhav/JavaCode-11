package com.exceptionhandling;

public class Try_Catch {
    public static void m1(){
    	try{
    		//int i = 12/0;
    		String str = null;
    		System.out.println(str.length());
    	}catch(Exception ae){
    		System.out.println("Exception handled");
    	}
    	System.out.println("Out of try_catch");
    }
	public static void main(String[] args) {
		m1();

	}

}

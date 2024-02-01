package com.exceptionhandling;

public class TryWithMultipleCatch {
    public static void m1(){
    	try{
    		int[]arr={};
    		System.out.println(arr[8]);
    	}catch(NullPointerException npe){
    		System.out.println("Exception handled by 1st catch");
    	}catch(ArithmeticException ae){
    		System.out.println("Exception handled by 2nd catch");
    	}catch(Exception e){
    		System.out.println("Exception handled by 3rd catch");
    	}
    }
	public static void main(String[] args) {
		m1();

	}

}

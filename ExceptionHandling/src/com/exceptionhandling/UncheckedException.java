package com.exceptionhandling;

public class UncheckedException {
    public void checkingException(){
    	//Arithmetic
    	//System.out.println(12/0);
    	
    	//NullPointer
//    	String str = null;
//    	System.out.println(str.length());
    	
    	//NumberFormatException
//    	String str = "123eefg";
//    	System.out.println(Integer.parseInt(str));
    	
    	//ArrayIndexOutOfBoundException:
//    	int[] arr = {1,2,3};
//    	System.out.println(arr[3]);
    	
    	//StringIndexOutOfBoundsException
    	String str = "java";
    	System.out.println(str.charAt(5));
    	
    	
    }
	public static void main(String[] args) {
		new UncheckedException().checkingException();
	}

}

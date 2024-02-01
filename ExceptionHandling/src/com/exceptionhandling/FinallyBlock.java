package com.exceptionhandling;

public class FinallyBlock {
   public static void m1(int a,int b){
	   try{
		   int result = a/b;
		   System.out.println(result);
	   }finally{
		   System.out.println("Crucial code executed....");
	   }
	   System.out.println("outside try & finally block");
   }
	public static void main(String[] args) {
		m1(12,0);

	}

}

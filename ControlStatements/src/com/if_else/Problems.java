package com.if_else;

public class Problems {
   public static boolean isPrime(int num){
	   boolean flag =true;
	   for(int i=2;i<=num/2;i++){
		   if(num%i==0){
			   flag = false;
			   break;
		   }
	   }
	   return flag;
   }
	public static void main(String[] args) {
		int num = 17;
		boolean result = Problems.isPrime(num);
		if(result){
			System.out.println(num+" is prime");
		}else{
			System.out.println(num+" is not a prime");
		}

	}

}

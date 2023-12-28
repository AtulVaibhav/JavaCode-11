package com.if_else;

import java.util.Scanner;

public class Test {
    public void isPositive(int num){
    	if(num>0){
    		System.out.println(num+" is a positive number");
    	}else{
    		System.out.println(num+" is a negative number");
    	}
    }
    public boolean isEven(int num){
    	if(num%2==0){
    		return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		Test t = new Test();
		t.isPositive(-12);
		
		int data = 14;
		boolean result = t.isEven(data);
		if(result){
			System.out.println(data+" is an even number");
		}else{
			System.out.println(data+" is an odd number");
		}
		System.out.println("------------------------------------");
		System.out.println("User Input");
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int userData = sc.nextInt();
		boolean result2 = t.isEven(userData);
		if(result2){
			System.out.println(userData+" is an even number");
		}else{
			System.out.println(userData+" is an odd number");
		}
		
	}

}

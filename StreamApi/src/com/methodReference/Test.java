package com.methodReference;

import java.util.Arrays;

interface A{
	//String changeToUpperCase(String str);
	//int[] sortNumber(int[] arr);
	
	//String[] sortNames(String[] arr);
	void printName(String str);
}

class Arithmetic{
	public int[] sortArray(int[] arr){
		 Arrays.sort(arr);
		 return arr;
	}
	
	public static String[] sortName(String[] arr){
		 Arrays.sort(arr);
		 return arr;
	}
}

public class Test {

	public static void main(String[] args) {
//		A a = String::toUpperCase;
//		System.out.println(a.changeToUpperCase("java"));
		
//		int[] arr = {6,2,1,3,8,7};
//		Arithmetic obj = new Arithmetic();
//		A a  = obj::sortArray;
//		System.out.println(Arrays.toString(a.sortNumber(arr)));
//		
//		String[] names = {"Vishal","Ankit","Jay","Yogesh"};
//		A a = Arithmetic::sortName;
//		System.out.println(Arrays.toString(a.sortNames(names)));
        
		A a = System.out::print;
		a.printName("Hello");
	}

}

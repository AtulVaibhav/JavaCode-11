package com.string;

public class Test {

	public static void main(String[] args) {
		String str = "Java";
		String str1 = "Java";
		if(str==str1){
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different objects");
		}
		
		System.out.println(str.compareTo(str1));
		if(str.equals(str1)){
			System.out.println("contents are same");
		}else{
			System.out.println("contents are different");
		}

	}

}

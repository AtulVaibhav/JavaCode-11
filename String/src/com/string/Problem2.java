package com.string;

public class Problem2 {
	public static void reverse(String str){
		String reverseWord = "";
		String[] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			reverseWord = reverseWord+" "+arr[i];
		}
		System.out.println(reverseWord);
	}
	
	public static void reverseWord(String str){
		String[] arr = str.split(" ");
		String newString="";
		for(int i=0;i<arr.length;i++){ //m
			newString = newString +" "+getReverse(arr[i]);
		}
		System.out.println(newString);
	}
	
	private static String getReverse(String str){
		String rev ="";
		for(int i=str.length()-1;i>=0;i--){//n
			rev = rev+str.charAt(i);
		}
		return rev;
	}
	

	public static void main(String[] args) {
		String str = "Java is a programming language";
		//reverse(str);
		System.out.println("Original String :"+str);
		reverseWord(str);

	}

}

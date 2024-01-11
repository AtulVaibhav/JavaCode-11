package com.stringbuffer;

public class Test3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//1.append()
		sb.append("Java");
		System.out.println(sb);
		
		//insert
		sb.insert(1, "Program");
		System.out.println(sb);
		
		//replace
		sb.replace(8,sb.length()-1,"ming");
		System.out.println(sb);
		
       //reverse()
		sb.reverse();
		System.out.println(sb);
		
	//delete
		sb.delete(1, 4);
		System.out.println(sb);
	}

}

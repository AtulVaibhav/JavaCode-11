package com.access_modifier;

public class Test {

	public static void main(String[] args) {
	   Student s1 = new Student();
	   System.out.println(s1.data);
	   System.out.println(s1.data2);
	  // System.out.println(s1.data3);
	   System.out.println(s1.getData3());
	   System.out.println(s1.data4);
	   
	   System.out.println("Child class object");
	   CSE obj = new CSE();
	   System.out.println(obj.data);
	   System.out.println(obj.data2);
	   //System.out.println(obj.data3);
	   System.out.println(obj.data4);
	   

	}

}

package com.string;

class Employee{
	String name = "Harsh";
	
	public String toString(){
		return this.name;
	}
}

public class Test3 {

	public static void main(String[] args) {
		String str = "Code";
		System.out.println(str.toString());

		Employee emp = new Employee();
		System.out.println(emp);
	}

}

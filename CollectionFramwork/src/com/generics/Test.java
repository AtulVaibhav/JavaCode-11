package com.generics;

class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return "Employee "+this.id+" "+this.name;
	}
}

class GenericClass<T>{
	T obj ;
	public GenericClass(T obj) {
		this.obj = obj;
	}
	
	public T getType(){
		return this.obj;
	}
}


public class Test {

	public static void main(String[] args) {
		GenericClass obj = new GenericClass(new Integer(10));
		System.out.println(obj.getType());
		
		GenericClass obj2 = new GenericClass(new Float(10.5f));
		System.out.println(obj2.getType());
		
		GenericClass obj3 = new GenericClass(new Employee(101,"Harsh"));
		System.out.println(obj3.getType());
		

	}

}

package com.inheritance;


class Parent{
	private int data = 200;
	public int parentClassProperty(){
		return this.data;
		
	}
}

class Child extends Parent{
	private int data2 = 300;
	public int childClassProperty(){
		return this.data2;
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.parentClassProperty());
		System.out.println(obj.childClassProperty());
		
		
		Parent parent = new Parent();
		System.out.println(parent.parentClassProperty());
		//System.out.println(parent.childClassProperty());
        
	}

}

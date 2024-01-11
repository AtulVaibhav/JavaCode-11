package com.inheritance;

class Base{
	private int data = 200;
	public int getData(){
		return this.data;
		
	}
}

class Derived extends Base{
	private int data2 = 300;
	public int getData(){
		return this.data2;
	}
	
	public int getResult(){
		return super.getData();
	}
}
public class SingleInheritance_II {

	public static void main(String[] args) {
		Derived derived = new Derived();
		System.out.println(derived.getResult());

	}

}

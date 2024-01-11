package com.inheritance;


class A{
	int data =100;
}


class B extends A{
	int data = 200;
	public void showData(){
		int data = 300;
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
}

public class SuperKeyword_II {

	public static void main(String[] args) {
		B b = new B();
		b.showData();

	}

}

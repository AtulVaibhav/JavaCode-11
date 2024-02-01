package com.polymorphism;

class Vehicle{
	public void speed(){
		System.out.println("80km/hr");
	}
}

class Car extends Vehicle{
	@Override
	public void speed(){
		System.out.println("100-120km/hr");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Car c = new Car();
		c.speed();
	}

}

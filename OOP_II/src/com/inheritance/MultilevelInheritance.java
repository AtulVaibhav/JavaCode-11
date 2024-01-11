package com.inheritance;


class Car{
	private String engineType = "petrolEngine";
	public String getEngineType(){
		return this.engineType;
	}
}

class FourWheeler extends Car{
	private int numberOfWhhels = 4;
	public int getWheels(){
		return this.numberOfWhhels;
	}
}

class RangeRover extends FourWheeler{
	private String brandName = "Tata Motors";
	public String getBrandName(){
		return this.brandName;
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		RangeRover rangeRover = new RangeRover();
		System.out.println(rangeRover.getBrandName());
		System.out.println(rangeRover.getWheels());
		System.out.println(rangeRover.getEngineType());

	}

}

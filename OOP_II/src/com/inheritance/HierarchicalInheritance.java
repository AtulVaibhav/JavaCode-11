package com.inheritance;

class Vehicle{
	private String brandName ="Tata Motors";
	public String getBrandName(){
		return this.brandName;
	}
}

class FourWheelerVehicle extends Vehicle{
	private String vehicleName = "RangeRover";
	public String getVehicleName(){
		return this.vehicleName;
	}
}

class TwoWheelerVehicle extends Vehicle{
	private String vehicleName =" X bike";
	public String getVehicleName(){
		return this.vehicleName;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		FourWheelerVehicle fourWheelerVehicle = new FourWheelerVehicle();
		System.out.println(fourWheelerVehicle.getBrandName()+" "+fourWheelerVehicle.getVehicleName());
	    
		
		TwoWheelerVehicle twoWheelerVehicle = new TwoWheelerVehicle();
		System.out.println(twoWheelerVehicle.getBrandName()+" "+twoWheelerVehicle.getVehicleName());
	}

}

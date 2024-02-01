package com.polymorphism;

class Dimension{
	public void area(int radius){
		System.out.println("Area of circle :"+Math.PI*radius*radius);
	}
	public void area(int length,int breadth){
		System.out.println("Area of rectange :"+length*breadth);
	}
	public void area(float side){
		System.out.println("Area of square :"+side*side);
	}
}
public class MethodOverloading {
   public static void main(Integer[] args){
	   
   }
	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.area(11,12);

	}

}

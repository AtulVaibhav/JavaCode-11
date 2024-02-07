package com.lambdaExpression;

@FunctionalInterface
interface Car{
	void speed(String str);
	//void structure(int num);
	
	//int sumOfElements(int[] arr);
}



public class Test {

	public static void main(String[] args) {
//		Car car = ()->System.out.print("110km/hr");
//		//System.out.println(car.getClass().getName());
//		car.speed();
		
		Car car = System.out::println;
		car.speed("110km/hr");
		
		
		
//		Car car = (num)->System.out.println("Car have "+num+" wheels");
//	    car.structure(4);
	
//	    Car car = (arr)->{
//	    	int sum=0;
//	    	for(int data:arr){
//	    		sum = sum+data;
//	    	}
//	    	return sum;
//	    };
//	  
//	    int[] arr = {1,2,3,4,5,6};
//	    System.out.println(car.sumOfElements(arr));
//	
//	
	
	}

}

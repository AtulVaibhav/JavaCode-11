package com.generics;

public class Test3 {
   public void getSum(int a,int b){
	   System.out.println(a+b);
   }
   
   public <T extends Number> void addData(T obj,T obj2){
	   System.out.println(obj.doubleValue()+obj2.doubleValue());
   }
	public static void main(String[] args) {
		//new Test3().getSum(12.5, 13.5);
		new Test3().addData(10.5f, 20.6f);

	}

}

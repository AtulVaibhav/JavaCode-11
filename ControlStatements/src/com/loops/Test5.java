package com.loops;

public class Test5 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i==5) break;
			System.out.println(i);
		}
		System.out.println("Outside the loop");

		
		for(int i=1;i<=10;i++){
			if(i==5) continue;
			System.out.println(i);
		}
		System.out.println("Outside the loop");
	}

}

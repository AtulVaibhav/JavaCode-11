package com.loops;

public class Problem1 {
    public static int sumOfDigit(int num){
    	int sum =0;
    	while(num!=0){
    		int rem = num%10;
    		num = num/10;
    		sum = sum+rem;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		int sum = Problem1.sumOfDigit(6734);
		System.out.println(sum);

	}

}

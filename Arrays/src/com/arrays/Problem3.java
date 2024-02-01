package com.arrays;

public class Problem3 {
    public static int removeDuplicates(int[] nums){
    	int counter=0;
    	for(int i=1;i<nums.length;i++){
    		if(nums[i-1]==nums[i]){
    			nums[i] = Integer.MIN_VALUE;
    		}
    	}
    	for(int data: nums){
    		if(data!=Integer.MIN_VALUE){
    			counter++;
    		}
    	}
    	return counter;
    }
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};//{1,2,3,4,5,6}
		System.out.println(removeDuplicates(arr));

	}

}

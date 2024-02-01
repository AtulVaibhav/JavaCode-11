package com.arrays;

public class BinarySearch {
    public  int binarySearch(int[] arr,int target,int low,int high){
    	try{
    		int mid = low+(high-low)/2;
        	if(arr[mid]==target){
        		return mid;
        	}else if(arr[mid]>target){
        		
        		high = mid-1;
        		return binarySearch(arr, target, low, high);
        	}else {
        		
        		low = mid+1;
        		return binarySearch(arr, target, low, high);
        		
        	}
    	}catch(Exception e){
    		return -1;
    	}	
    }
	public static void main(String[] args) {
		int[] arr ={1,2,3,9,11};
		int target = 2;
		int low=0;
		int high = arr.length-1;
		System.out.println(new BinarySearch().binarySearch(arr, target, low, high));

	}

}

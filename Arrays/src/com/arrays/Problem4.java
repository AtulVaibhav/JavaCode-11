package com.arrays;

public class Problem4 {
    	public static int searchInsert(int[] nums, int target) {
            int low=0;
            int high=nums.length-1;
           return search(nums,target,low,high);

        }
        private static int search(int[] nums,int target,int low,int high){
               int mid = low+(high-low)/2;
               if(nums[mid]==target){
                   return mid;
               }else if(nums[mid]<target){
                  return search(nums,target,mid+1,high);
               }else if(nums[mid]>target){
                   return search(nums,target,low,mid-1);
               }
               return high+1;
         
    	    }
	public static void main(String[] args) {
		int[] arr={1,3,5,6};
		int target = 7;
		System.out.println(searchInsert(arr, target));
		

	}

}

package com.arrays;

public class Problem1 {
   public static int sumOfElements(int[] arr){
	   int sum=0;
	   for(int i=0;i<arr.length;i++){
      
	   sum += arr[i];
        }
	   return sum;
   }
   
   public static int findPosition(int[] arr,int key){
	   for(int i=0;i<arr.length;i++){
		   if(arr[i]==key){
			   return i;
		   }
	   }
	   return -1;
   }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int sum = Problem1.sumOfElements(arr);
		System.out.println(sum);
		
		int[] arr2 = {1,21,34,56,78,19,22};
		System.out.println(Problem1.findPosition(arr2, 23));
	}

}

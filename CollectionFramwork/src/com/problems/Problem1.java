package com.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void getCount(int[] arr){
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int data:arr){
    		if(map.containsKey(data)){
    			map.put(data, map.get(data)+1);
    		}else{
    			map.put(data, map.getOrDefault(data, 1));
    		}
    	}
    	
    	System.out.println(map);
    }
	public static void main(String[] args) {
		int[] arr={1,2,1,3,4,3,4,2,1,5,4,5,1,2};
        getCount(arr);
	}

}

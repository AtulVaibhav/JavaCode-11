package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		//add
		map.put("Vinay",24);
		map.put("Ankit",28);
		map.put("Harsh",23);
		map.put("Akhil",32);
		map.put("Raghav",30);
		
		System.out.println(map);
		
		
		//duplicates: key can't be duplicates ,but values can
		//if we add key which already exists then value will get updated
		
		map.put("Harsh", 31);
		System.out.println(map);
		
		
		//null 
		map.put(null, 10);
		System.out.println(map);
		
		
		//Traversal
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			//print only keys:getKey()
			//System.out.println(entry.getKey());
			
			//printing only values:getValue
			//System.out.println(entry.getValue());
			
			System.out.println(entry.getKey()+" ----->"+entry.getValue());
		}
		
		//check key then print value :get(key)
		if(map.containsKey("Akhil")){
			System.out.println(map.get("Akhil"));
		}
		
		
		//get key ,if value is present:entrySet()
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			if(entry.getValue()==32){
				System.out.println(entry.getKey());
			}
		}
		
		//remove
		if(map.containsKey("Akhil")){
			System.out.println(map.remove("Akhil"));
		}
		
		System.out.println(map);	

	}

}

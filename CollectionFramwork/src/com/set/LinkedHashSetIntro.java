package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIntro {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		//add
		set.add("Vinay");
		set.add("Aayush");
		set.add("Bhuvan");
		
		System.out.println(set);
		
		//duplicates
		set.add("Aayush");
		System.out.println(set);
		
		//null
		set.add(null);
		System.out.println(set);
		
		
		//Traversal
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		//contains
		System.out.println(set.contains("Vinay"));
		
		
		//remove
		if(set.contains("Vinay")){
			System.out.println(set.remove("Vinay"));
		}

	}

}

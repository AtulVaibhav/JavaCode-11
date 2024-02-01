package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIntro {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//checking hashset is empty or not
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		//add elements
		set.add(13);
		set.add(1);
		set.add(15);
		set.add(2);
		
		System.out.println(set);
		
		//add duplicates:
		set.add(2);
		System.out.println(set);
		
		//add null
		set.add(null);
		System.out.println(set);
		
		
		//Traversal
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//checking element
		System.out.println(set.contains(15));
		
		
		//remove
		System.out.println(set.remove(15));
	}

}

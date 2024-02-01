package com.set;

import java.util.TreeSet;

public class TreeSetntro {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//add
		set.add("Vinay");
		set.add("Aayush");
		set.add("Bhuvan");
		
		System.out.println(set);
		
		//duplicates
		set.add("Vinay");
		System.out.println(set);
	
		//null
//		set.add(null);
//		System.out.println(set);

	}

}

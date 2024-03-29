package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIntro {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//adding objects to arrayList
		list.add(10);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(null);
		System.out.println(list);
		
		//Access the object from arrayList
		System.out.println(list.get(3));
		
		
		//Traversing an arrayList
		//using for loop
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
       
		//enhanced for loop
		for(Integer obj :list){
			System.out.println(obj);
		}
		
		//using iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//delete
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		
		//contains
		System.out.println(list.contains(1));
	}

}

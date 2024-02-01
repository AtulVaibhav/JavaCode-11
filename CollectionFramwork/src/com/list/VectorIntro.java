package com.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorIntro {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		//check vector is empty or not
		System.out.println(vector.isEmpty());
		
		//add elements to vector:
		for(int i=1;i<=5;i++){
			vector.add((int) Math.pow(i, 3));
		}
		
		System.out.println(vector);
		
		//Traverse
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("______________________________________________");
		for(int i=0;i<vector.size();i++){
			System.out.println(vector.get(i));
		}
		System.out.println("______________________________________________");
		for(Integer data:vector){
			System.out.println(data);
		}
		System.out.println("______________________________________________");
		
		//Accessing element from given index position
		System.out.println(vector.get(2));
		
		//Check element present in vector
		System.out.println(vector.contains(125));
		
		//update exiting value in vector
		System.out.println(vector);
		vector.set(2, 30);
		System.out.println(vector);
		
		
		//remove element from vector
		vector.remove(2);
		System.out.println(vector);
		
	}

}

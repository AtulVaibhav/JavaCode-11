package com.list;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//stack is empty
		System.out.println(stack.isEmpty());
		//push elements to stack
		for(int i=10;i<=70;i=i+10){
			stack.push(i);
		}
		System.out.println(stack);
		
		//head element
		System.out.println(stack.peek());
		
		//get position
		for(int i=0;i<stack.size();i++){
			if(stack.get(i)==stack.peek()){
				System.out.println(i);
			}
		}
		
		System.out.println(stack.indexOf(500));
        int key  = 40;
        if(stack.contains(key)){
        	System.out.println(stack.indexOf(key));
        }
        
        //update
        System.out.println(stack);
        System.out.println(stack.set(3, 100));
        System.out.println(stack);
        
        
        //remove
        System.out.println(stack.remove(4));
        System.out.println(stack);
        
	}

}

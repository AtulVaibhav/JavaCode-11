package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//Creating Stream of Objects:
		List<Integer> list = new ArrayList<>();
           for(int i=1;i<=10;i++){
        	   list.add(i);
           }
           
        List<Integer> list2 = Arrays.asList(11,12,13,14,15,16,17);
        
        //stream()
        Stream<Integer> stream = list.stream();
        //[1,2,3,4,5,6,7,8,9,10]
        
        //of()
        Stream<String> stream2 = Stream.of("Ankit","Vishal","John");
        Stream<Integer> stream3 = list2.stream();
        
        
        //Intermediate-Operations & Terminal-Operation
        //filter
        
        List<Integer> evenList = stream.filter(x->x%2==0)
        		                .collect(Collectors.toList());        
        System.out.println(evenList);
        
        
        //map-->
        List<Integer> evenSqureNumber = stream3.filter(x->x%2==0)
        		                        .map(x->x*x)
        		                        .collect(Collectors.toList()); 
        System.out.println(evenSqureNumber);
        
        //sorted()
        stream2.sorted().forEach(System.out::println);
        
        //distinct
        List<Integer> data = Arrays.asList(1,2,1,3,1,4,2,4,3,5);
        data.stream().distinct().forEach(System.out::println);
        
        //anyMatch
        List<String> names = Arrays
        		.asList("Ankit","Ashish","Avinash","Vishal","Vicky");
        
        boolean result =names.stream().anyMatch(x->x.startsWith("Av"));
        System.out.println(result);
        
        //allMatch
        boolean result2 =names.stream().allMatch(x->x.startsWith("Av"));
        System.out.println(result2);
        
        //reduce
        List<Integer>elements = Arrays.asList(1,2,3,4,5,6);
        int sum = elements.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);
        
	}

}

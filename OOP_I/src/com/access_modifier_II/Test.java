package com.access_modifier_II;

import com.access_modifier.Student;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		//System.out.println(s1.data);
		System.out.println(s1.data2);
		//System.out.println(s1.data3);
		//System.out.println(s1.data4);
		
		System.out.println("Child class outside package");
		EC obj2 = new EC();
		//System.out.println(obj2.data);
		System.out.println(obj2.data2);
		//System.out.println(obj2.data3);
		//System.out.println(obj2.data4);

	}

}

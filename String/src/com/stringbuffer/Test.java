package com.stringbuffer;

public class Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Java");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb.hashCode());
		System.out.println(sb);

	}

}

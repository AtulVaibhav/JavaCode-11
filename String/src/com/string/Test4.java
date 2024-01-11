package com.string;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("String Methods:");
        String str = "JavaCode";
		//1.length()
        System.out.println(str.length());
        
        //2.charAt(index)
        System.out.println(str.charAt(1));
        
        
        //3.indexOf(char)
        System.out.println(str.indexOf('a'));
        
        //4.lastIndexOf(char)
        System.out.println(str.lastIndexOf('a'));
        
        
        //5.toUpperCase()
        System.out.println(str.toUpperCase());
        
        //6.toLowerCase()
        System.out.println(str.toLowerCase());
        
        
        //7.toCharArray()
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
        
        
        //8.split(regex)
        String str2 = "Java World";
        String[] arr2 = str2.split(" ");
        for(int i=0;i<arr2.length;i++){
        	System.out.println(arr2[i]);
        }
        
        
        //9.substring
        System.out.println(str.substring(1,5));
        
        //10.contains
        System.out.println(str.contains("ava"));
        
        
        //11.compareTo
        String str3 = "Hello";
        System.out.println(str.compareTo(str3));
        
        char ch = str.charAt(0);
        char ch2 = str3.charAt(0);
        int i=ch;
        int j = ch2;
        System.out.println(i+" "+j);
        
        //12.concat()
        String str4 = "Java".concat("World");
        System.out.println(str4);
        
        
        //13.equals
        String str5 = "JavaWorld";
        System.out.println(str4.equals(str5));
        
        
        //14.==
        System.out.println(str4==str5);
        
	}

}

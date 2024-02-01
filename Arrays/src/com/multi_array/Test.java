package com.multi_array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//creating 2-d array
//	 

		
		System.out.println("________________________________");
		System.out.println("Jagged Array:");
		int[][] ar = {{1,2,3},{11,12},{21}};
		System.out.println("Displaying elements");
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}

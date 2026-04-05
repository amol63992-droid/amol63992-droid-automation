package com.TestNGFramework;

import java.util.Iterator;

public class TwoDimentionArray {

	public static void main(String[] args) {

		int[][] arr=new int[3][2];
		
		arr[0][0]=15;
		arr[0][1]=2;
		
		arr[1][0]=20;
		arr[1][1]=45;
		
		arr[2][0]=5;
		arr[2][1]=6;
		
		for (int i = 0; i <=2; i++) {//row
			for (int j = 0; j <=1; j++) {//column
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}

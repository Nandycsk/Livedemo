package com.energyandutility.COLJservice;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		int a[]= {6, 9, 4, 8, 3, 1, 7};
		
		System.out.println("Array before Sort"+ Arrays.toString(a));
		
		int str1= a.length;
		
		for (int i = 0; i < str1 - 1; i++) { //No of passes

			for (int j = 0; j < str1 - 1; j++) { // No of iteration

				if(a[j]>a[j+1]){
					int temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}
		}
		System.out.println("Array After Sort"+ Arrays.toString(a));
	}

}

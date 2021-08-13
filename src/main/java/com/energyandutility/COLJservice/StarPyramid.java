package com.energyandutility.COLJservice;

import java.util.Scanner;

public class StarPyramid {
	int i, j, k;
	 int number;
	 Scanner sc;
	
	public  StarPyramid(){
		
		sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		number= sc.nextInt();
		
		for(i=1; i<number; i++){
			
			for(j=i; j<number; j++)
			
				System.out.print(" ");
			
			for(k=1; k<(i*2); k++)
			
				System.out.print("*");
			
			System.out.println("\n");
		}
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		StarPyramid obj= new StarPyramid();
		obj.clone();
        
	}
}



package com.energyandutility.COLJservice;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		
		int a=100, b=200, c=300;
		
		System.out.println("Before Swap"+a+ " " +b+ ""+c);
		
		/*int t= a; Step 1
		a=b;
		b=t;*/
		
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		
		
		System.out.println("After Swap"+a+ " " +b+""+c);
		
		

	}

}

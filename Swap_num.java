package com.sme.Assignment1;

public class Swap_num {

	public static void main(String[] args) {
		// 4. Write a Java program to swap two variables without temp variable?

	int a= 20;
	int b= 30;
	a= a+b;
	b= a-b;
	a= a-b;
	

	System.out.println("value of a: "+a +" , " + "value of b: " +b);
	}

}

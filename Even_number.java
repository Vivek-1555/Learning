package com.sme.assignment2;

public class Even_number {

	public static void main(String[] args) {
		// 10.Write a program to get even number between 2000-4000?
		
		int num1 = 4000;
		int count = 0;
		
		for(int i=2000;i<=num1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;				
			}
		}
		System.out.println("Total even number between 2000 to 4000 = " + count);
	}

}

package com.sme.Assignment1;

public class Reverse_string {

	public static void main(String[] args) {
		// 7. Write a program to reverse an string using for and while loop.
		
		String str = "hello";
	/*	String rev = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(str.length()-i-1);
			rev= rev+ch;
		}
		System.out.println(rev);
	*/
		
		// Using while loop
		
		int i = str.length();
		while (i>0)
		{
			System.out.print(str.charAt(i-1)); 
			i--;
			
		}
		
	}

}

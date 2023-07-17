package com.sme.assignment2;

public class IthChar {

	public static void main(String[] args) {
		// 8.Write a  program for removing i-th character from a string.
		
		String s= "Write a program for removing i-th character from a string?";
		int k=10;
		String ab = s.substring(0, k-1) + s.substring(k);
		System.out.println(ab);
		
	}

}

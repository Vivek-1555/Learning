package com.sme.assignment2;

public class Word_Length {

	public static void main(String[] args) {
		// 7. Write a  program to find words which are greater than given length k?
		
		int k=4;
		String t[] = {"Apple", "banana", "kiwi", "berry", "almond"};
		for(int i=0;i<t.length;i++) {
			if(t[i].length()>k) {
				System.out.println(t[i]);
			}
		}

	}

}

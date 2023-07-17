package com.sme.assignment2;

public class Split_Join {

	public static void main(String[] args) {
		// 6. Write a  program to split and join a string?
		
		String s= "Write a program to split and join a string.";
		String[] t = s.split(" ");
		for(int i=0;i<t.length;i++)
		{
		System.out.println(t[i]);
		}
		String arr2 = String.join(",", t);
		System.out.println(arr2);
			
	}
	}


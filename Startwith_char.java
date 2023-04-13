package com.sme.Assignment1;

public class Startwith_char {

	public static void main(String[] args) {
		// 9.Write a program to get only the word which start with 'h' in the given
		// string.?
		// eg String s= "hi good morning, how are you, We are here to celibrate holi,
		// plz come home".
		
		String str= "hi good morning, how are you, We are here to celibrate holi, please come home.";
		
		String[] strArray = str.split(" ");
//     	System.out.println();
		
//		for(String s:strArray)
//		{
//			System.out.println(s);
//		}
		for(int i=0;i<=strArray.length-1;i++)
		{
			if(strArray[i].charAt(0)=='h')
			{
				System.out.println(strArray[i]);
			}
		}
	}

}

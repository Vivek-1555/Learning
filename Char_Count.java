package com.sme.Assignment1;

public class Char_Count {

	public static void main(String[] args) {
		// 8. Write a program to find number of duplicate(repeated) character in the string.
		
		String str= "hello";
		String str1="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				str1=str1+str.charAt(i);
			}
		}
//		System.out.println("new String "+str1);
		
		
	    char first[] = new char[str1.length()];
	    char second[] = new char[str1.length()];
		
		for(int i=0; i <= first.length-1; i++)
		{
			first[i] = str1.charAt(i);
			second[i] = str1.charAt(i);
		}
	//	for(char c:first)
		for(int i=0;i<=first.length-1;i++)
		{
//			System.out.print(c);
//			System.out.println(first[i]);
		}
//		System.out.println();
		
		
		for(int i=0;i<=first.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=second.length-1;j++)
			{
				if((first[i]==second[j]) && first[i]!='0')
				{
					count++;
					second[j]='0';
				}
			}
			if(first[i]!='0' && count!=0)
			{
				System.out.println(first[i]+" ---> "+count);
				first[i]='0';
			}
			
		}
		
	}
		
		

}

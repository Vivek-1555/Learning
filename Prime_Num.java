package com.sme.assignment2;

// 5.Write a program which returns given number is prime or not.
public class Prime_Num {
	
	public void Prime(){
		
		int num= 136, count = 0;
		
			for(int i=2;i<num;i++)
			{
				if(num%i==0) {
					count =count+1;
				}
				
			}
			
			if(count >0) {
				
			System.out.println("Number is not prime.");
			}
			else {
				System.out.println("Number is prime.");
			}
					
		
	}
	public static void main(String[] args) {
		Prime_Num p= new Prime_Num();
		p.Prime();

	}

}

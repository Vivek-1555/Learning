package com.sme.assignment2;


// 3. Write an example(code) of calling a function using class object.

class One{
	
	public void method1() {
		
		System.out.println("Method one displaying");
	}
}

class Two{
	
	public void method2() {
		System.out.println("method 2 displaying");
		
	}
}

public class Calling_Function {

	public static void main(String[] args) {
		
		One m1 = new One();
		m1.method1();
		
		Two m2 = new Two();
		m2.method2();
		
	}

}

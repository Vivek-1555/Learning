package com.sme.assignment2;


// 1. Write an example(code) to show method is overridden?

class Parent{
	
	public void Property() {
		
		System.out.println("Parent Property,My Property");
	}
	
	public void Marriage() {
		
		System.out.println("Maya, Lalita");
	}
}

class Child extends Parent{
	
	public void Marriage() {
		
		System.out.println("Wanna be Bachelor");
	}
}


public class Override_Eg {

	public static void main(String[] args) {
		
		Parent p= new Child();
		p.Marriage();
		
	}

}

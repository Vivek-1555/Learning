package com.sme.assignment2;

 class Animal {
	
		// 2. Write an example(code) to inherit one class property from another class.
	public void run() {
		
		System.out.println("Animal run");
	}
	
	public void eat() {
		System.out.println("Animal eat");
	}

}

class Dog extends Animal
{
	public void Tail() 
	{
		System.out.println("Dog has a tail ");
	}
	
	public void Leg() 
	{
		System.out.println("Dog has four legs");
	}
	
}

public class Inherit_Code {

	public static void main(String[] args) 
	{
		Dog Shepherd = new Dog();
		Shepherd.eat();
		Shepherd.run();
	}
	
}

package com.bootcamp.learning.lambda;

public class Greeter {

	public void doGreetInYourStyle(GreetStyle style) {
		style.greet();
	}
	public void greet() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greet();
		
		Greeting mygreeting = new Greeting();
		greeter.doGreetInYourStyle(mygreeting);
		
		greeter.doGreetInYourStyle(new GreetStyle() {
			
			@Override
			public void greet() {
				System.out.println("Anonymous inner class Hello World");
				
			}
		});
		
		greeter.doGreetInYourStyle(()->System.out.println("Lambda style ...Hello World"));

	}

}

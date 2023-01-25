package com.bootcamp.learning;

public class ConcreteFromAbstract extends AbstractClassLearning{

	public ConcreteFromAbstract() {
		super();
		System.out.println("I am concrete constructor");
	}

	@Override
	String printSomething() {
		System.out.println("Message from Concrete class");
		return "printed";
	}
	
	public void anotherTask() {
		System.out.println("Doing another task from concrete class");
	}

	@Override
	public void learnSomething() {
		// TODO Auto-generated method stub
		
	}

	
	public static int learningScore() {
		return 20;
	}

}

package com.bootcamp.learning;

public class Playground {

	public static void main(String[] args) {
		AbstractClassLearning myobject = new ConcreteFromAbstract();
		myobject.printSomething();
		System.out.print(myobject.learningScore());

	}

}

package com.bootcamp.learning;

public  abstract class AbstractClassLearning implements LearnInterface {

	public int number =10;

	public AbstractClassLearning() {
	}
	
	 String printSomething() {
		 System.out.println("Message From Parent Named abstract class.");
		 return "Parent";
	 }
	 
	 public static int learningScore() {
		 return 10;
	 }
	
}

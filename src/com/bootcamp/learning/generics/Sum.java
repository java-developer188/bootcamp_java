package com.bootcamp.learning.generics;

public class Sum <S extends Number> {
	S num1;
	S num2;
	
	
	public Sum(S num1 , S num2) 
	{
		this.num1 = num1;
		this.num2 = num2;
		
		
	}
	 public void op() {
		// System.out.println(this.num1+this.num2);
	 }

	
	
	public static void main(String[] args) {
		Sum<Float> sum = new Sum<>(2f,3f);
	}
}

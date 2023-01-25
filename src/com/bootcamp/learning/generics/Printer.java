package com.bootcamp.learning.generics;

public class Printer <T> {
	
	private T item;
	
	public void  print() {
		System.out.println(item);
	}

	public Printer(T item) {
		this.item = item;
	}

}

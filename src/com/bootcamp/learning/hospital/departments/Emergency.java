package com.bootcamp.learning.hospital.departments;

public class Emergency extends Department {

	protected Emergency() {
		super();
	}
	
	@Override
	public String getName() {
		return "Emergency";
	}
}

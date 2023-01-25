package com.bootcamp.learning.framework;

import java.util.Scanner;

public abstract class Assignment2Base implements Assignment {
	
	String inputString;

	@Override
	public String getAssignmentName() {
		return "Assignment # 2";
	}

	

	@Override
	public void execute(Scanner scanner) {
		input(scanner);
		output(process());
	}
	



	private int process() {
		String result[] = inputString.replaceAll("\\s+$","").split(" ");
		return result.length;
	}



	protected abstract void output(int count);



	protected abstract void input(Scanner scanner);

}

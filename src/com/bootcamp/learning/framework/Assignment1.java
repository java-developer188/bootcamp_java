package com.bootcamp.learning.framework;

import java.util.Scanner;

public class Assignment1 implements Assignment {

	@Override
	public String getAssignmentName() {
		return "Assignment # 1";
	}

	@Override
	public String getAssignee() {
		return "Syed Sibte Haider";
	}

	@Override
	public void execute(Scanner scanner) {
		System.out.println("Hello World");
	}

}

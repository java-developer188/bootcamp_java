/**
 * 
 */
package com.bootcamp.learning.framework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author haidesib
 *
 */
public class Assignment2Haider extends Assignment2Base {
	

	public static void main(String args[]) {
		Assignment2Haider assignment2Haider =new Assignment2Haider();
		
		try(Scanner scanner =  new Scanner(System.in)) {	
		assignment2Haider.execute(scanner);
		}
	}
	
	@Override
	public String getAssignee() {
		return "Syed Sibte Haider";
	}

	@Override
	protected void output(int count) {
		System.out.println("Your input:\n"+inputString+"\n"+"contains "+count+" words.");
	}
	
//	@Override
//	protected void input() {
//		try(BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))){
//			inputString = scanner.readLine();
//		}
//		catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//	}

	@Override
	protected void input(Scanner scanner) {
		System.out.println("Please enter some text");
		scanner = new Scanner(System.in);
		try
		{		inputString = scanner.nextLine();
		
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

package com.bootcamp.learning.framework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @author Ali
 *
 */
public class Assignment2Ali extends Assignment2Base {

	public static void main(String args[]) {
		Assignment2Ali assignment2Ali =new Assignment2Ali();
		Scanner scanner = new Scanner(System.in);
		assignment2Ali.execute(scanner);
		scanner.close();
	}
	
	@Override
	public String getAssignee() {
		return "Ali";
	}

	@Override
	protected void output(int count) {
		System.out.println("You entered "+count+" words.");
	}

//	@Override
//	protected void input(Scanner scanner) {
//		try(BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))){
//			inputString = scanner.readLine();
//		}
//		catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//	}
	
	@Override
	protected void input(Scanner scanner) {
		System.out.println("Please enter some sentence:");
		scanner = new Scanner(System.in);
		try
		{		inputString = scanner.nextLine();
		
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

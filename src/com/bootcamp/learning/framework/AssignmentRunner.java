/**
 * 
 */
package com.bootcamp.learning.framework;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author S.S.Haider
 *
 */
public class AssignmentRunner {
	
	

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		
		AssignmentRunner runner = new AssignmentRunner();
		AssignmentExecutor executor = runner.new AssignmentExecutor();
		executor.execute(args);
	}
	
 class AssignmentExecutor {
		
		
		public List<Assignment> assignmentList ;
		
		private void addAssignments(){
			try {
				Class assignment  = Class.forName("com.bootcamp.learning.framework.Assignment");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			assignmentList = new ArrayList<Assignment>();
			assignmentList.add(new Assignment1());
			assignmentList.add(new Assignment2Haider());
			assignmentList.add(new Assignment2Ali());
		}

		
		public void execute(String args[]) {
			Scanner scanner = new Scanner(System.in);
			addAssignments();
			for (Assignment assigment : assignmentList) {
				System.out.println(assigment.getAssignmentName());
				System.out.println(assigment.getAssignee());
				assigment.execute(scanner);
				System.out.println();
			}
			scanner.close();

		}

	}

}

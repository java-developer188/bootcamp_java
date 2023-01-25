package com.bootcamp.learning.framework;

import java.util.Scanner;

/**
 * 
 * @author S.S.Haider
 *
 */
public interface Assignment {
	String 	getAssignmentName();
	String	getAssignee();
	void execute(Scanner scanner);

}

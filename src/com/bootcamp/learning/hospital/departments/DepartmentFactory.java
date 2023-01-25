package com.bootcamp.learning.hospital.departments;

public class DepartmentFactory {
    	private DepartmentFactory() {}
    	public static Department getDepartment(Department.Names name) {
    		switch (name) {
			case Emergency:
				return new Emergency();	
			case OPD:
				return new OPD();		
			case Pediatrics:
				return new Pediatric();	
			default:
				return null;
			}
    	}
}

package com.bootcamp.learning.hospital;

import java.util.HashMap;
import java.util.Map;

import com.bootcamp.learning.hospital.departments.Department;
import com.bootcamp.learning.hospital.departments.DepartmentFactory;

public class Hospital {

	private Map<Department.Names,Department> departments = new HashMap<Department.Names, Department>();
	public static Hospital hospital ;
	
	private Hospital() {
		departments.put(Department.Names.Emergency,DepartmentFactory.getDepartment(Department.Names.Emergency));
		departments.put(Department.Names.OPD,DepartmentFactory.getDepartment(Department.Names.OPD));
		departments.put(Department.Names.Pediatrics,DepartmentFactory.getDepartment(Department.Names.Pediatrics));
	}
	
	public static Hospital getHospital() {
		if(hospital == null) {
			hospital = new Hospital();
			return hospital;
		}
		else {
			return hospital;
		}
	}
	
	public void showPatients() {
		System.out.println("Patients List");
		System.out.println("***********************");
		for(Department department : departments.values()) {
			System.out.println(department.getName());
			System.out.println("***********************");
			department.showPatients();
			System.out.println("-----------------------");
			System.out.println("\n");
		}
	}
	
	public void showDepartments() {
		System.out.println("Departments");
		System.out.println("***********************");
		for(Department department : departments.values()) {
			System.out.println(department.getName());
		}
		System.out.println("\n");
	}
	
	public void addPatient(Department.Names name, Patient patient) {
		hospital.departments.get(name).addPatient(patient);
	}
	
	public Department getDepartment(Department.Names name) {
		return departments.get(name);
	}
}

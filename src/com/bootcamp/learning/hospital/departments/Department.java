package com.bootcamp.learning.hospital.departments;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.learning.hospital.Employee;
import com.bootcamp.learning.hospital.Patient;

public abstract class Department {
	
	public enum Names{Emergency,OPD,Pediatrics}
	
	List<Employee> employees = new ArrayList<>();
	List<Patient> patients = new ArrayList<>();
	public abstract String getName();
	
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	
	public void showEmployees() {
		show(employees);
	}
	
	public  void showPatients() {
		show(patients);
	}
	
	protected <T> void show(List<T> list) {
		for(T item : list) {
			System.out.println(item);
		}
	}


	@Override
	public String toString() {
		return "Department [employees=" + employees + ", patients=" + patients + "]";
	}
	
	
}

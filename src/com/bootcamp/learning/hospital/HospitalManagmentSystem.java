package com.bootcamp.learning.hospital;

import com.bootcamp.learning.generics.Printer;
import com.bootcamp.learning.hospital.departments.Department;
import com.bootcamp.learning.hospital.departments.DepartmentFactory;
import com.bootcamp.learning.hospital.departments.Emergency;

public class HospitalManagmentSystem {

	public static void main(String[] args) {
		Hospital hospital = Hospital.getHospital();
		hospital.showDepartments();
		hospital.addPatient(Department.Names.Emergency, new Patient.PatientBuilder("John","Williams").build());
		hospital.addPatient(Department.Names.Emergency, new Patient.PatientBuilder("Shafiq","Ahmed").build());
		hospital.addPatient(Department.Names.OPD, new Patient.PatientBuilder("Silvia","Patricia")
																.setAge(23)
																.setIllness("throat pain")
																.build());
		hospital.showPatients();
		
		Emergency emergency = (Emergency) hospital.getDepartment(Department.Names.Emergency);
		emergency.addPatient(new Patient.PatientBuilder("Robert","Lewis").build());
		//emergency.addEmployee(new Employee().setName("Talha"));
		emergency.showEmployees();
		
		hospital.showPatients();
		
		Printer<Patient> patientPrinter = new Printer<Patient>(new Patient.PatientBuilder("Mohammad","Amir").setAge(32).build());
		patientPrinter.print();
		//Printer<Employee> empPrinter = new Printer<Employee>(new Employee().setName("A.Basit"));
		//empPrinter.print();
		Printer<Department> departPrinter  = new Printer<Department>(DepartmentFactory.getDepartment(Department.Names.Pediatrics));
		departPrinter.print();
	}

}

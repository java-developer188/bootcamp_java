package com.bootcamp.learning.lambda;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Predicate;

import com.bootcamp.learning.hospital.Employee;
import com.bootcamp.learning.hospital.Patient;
import com.bootcamp.learning.hospital.departments.Emergency;

public class LambdaPlayground{
	
	public List<Patient> patients = new ArrayList<Patient>();
	
	public LambdaPlayground() {
		patients.add(new Patient.PatientBuilder("John","Williams").setAge(21).setIllness("Fracture").build());
		patients.add(new Patient.PatientBuilder("Shafiq","Ahmed").setAge(28).setIllness("Fever").build());
		patients.add(new Patient.PatientBuilder("Silvia","Patricia").setAge(23).setIllness("Throat pain").build());
		patients.add(new Patient.PatientBuilder("Robert","Lewis").setAge(23).setIllness("Lasik").build());
		patients.add(new Patient.PatientBuilder("Mohammad","Amir").setAge(32).build());
	}

	public static void main(String[] args) {
		
		LambdaPlayground obj = new LambdaPlayground();
		
		showHeader("All Patients");
		show(obj.patients ,p->true);
		
		showHeader("Sorted in Ascending order by age");
		obj.patients.sort((p1,p2)->p1.getAge().compareTo(p2.getAge()));
		show(obj.patients,p->true);
		
		showHeader("Having First Name starting with S");
		show(obj.patients,p->p.getFirstName().startsWith("S"));
		
		
		showHeader("Having age greater than 25");
		show(obj.patients,p->p.getAge()>25);
	}

	
	public static void show(List<Patient> list ,Predicate<Patient> pre) {
		
		list.forEach(p -> {
							if(pre.test(p)) 
								{
									System.out.println(p);
								}
							}
					);
		}
	
	public static void showHeader(String message) {
		System.out.println("\n\n\n");
		System.out.println("********************************************************************************");
		System.out.println("                  "  +message);
		System.out.println("********************************************************************************");
	}
	
	}

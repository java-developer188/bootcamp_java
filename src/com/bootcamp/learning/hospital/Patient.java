package com.bootcamp.learning.hospital;

public class Patient {
	private String firstName;
	private String lastName;
	private Integer age;
	private String illness;

	private Patient(PatientBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.illness = builder.illness;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Patient ["+ firstName + " " + lastName + ", " + age + ", illness=" + illness
				+ "]";
	}

	public String getIllness() {
		return illness;
	}
	
//	@Override
//	public String toString() {
//		return "Patient [" + firstName + " " + lastName + ", " + age + ", illness=" + illness
//				+ "]";
//	}

	public static class PatientBuilder {
		private String firstName;
		private String lastName;
		private Integer age;
		private String illness;
		
		public PatientBuilder(String firstName , String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PatientBuilder setAge(Integer age) {
			this.age = age;
			return this;
		}

		public PatientBuilder setIllness(String illness) {
			this.illness = illness;
			return this;
		}
		
		public Patient build() {
			return new Patient(this);
		}

	}

	
	
}

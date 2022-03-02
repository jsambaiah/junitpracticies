package com.corejava.juintbasics.collections;

import java.util.Objects;

public class Employee {

	public int empID;
	public String empName;
	public int salary;
	public int age;
	public String gender;

	

	@Override
	public int hashCode() {
		return Objects.hash(empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName);
	}

	// default constructor
	public Employee() {
	}

	// Parameterized constructor
	public Employee(int empID, String empName, int salary, int age, String gender) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.gender = gender;

	}

	public String toString() {
		return empID +" "+ empName +" "+ salary +" "+ age +" "+ gender ;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

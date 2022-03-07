package com.corejava.juintbasics.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Employee implements Comparable<Employee> {

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
		return empID + " " + empName + " " + salary + " " + age + " " + gender;
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

	@Override
	/*
	 * public int compareTo(Employee e) { if (age == e.age) return 0; else if (age >
	 * e.age) return 1; else return -1;
	 * 
	 * }
	 */
	public int compareTo(Employee e) {
		if (empID == e.empID)
			return 0;
		else if (empID > e.empID)
			return 1;
		else
			return -1;

	}

	public static List<Employee> getEmployeeList() {
		List<Employee> eAL = new ArrayList<Employee>();

		eAL.add(new Employee(104, "Swathi", 45000, 30, "Female"));
		eAL.add(new Employee(101, "Haritha", 65000, 38, "Female"));
		eAL.add(new Employee(102, "Kavitha", 55000, 32, "Female"));
		// eAL.add(new Employee(121, "Samba", 55000, 36, "Male"));
		// eAL.add(new Employee(125, "Charan", 5000, 16, "Male"));
		// eAL.add(new Employee(225, "Dhruvan", 15000, 12, "Male"));
		// eAL.add(new Employee(525, "Kavitha", 15000, 25, "Female"));
		return eAL;
	}

	public static Set<Employee> getEmployeeSet() {
		Set<Employee> eSet = new HashSet<Employee>();

		eSet.add(new Employee(104, "Yakshitha", 45000, 30, "Female"));
		eSet.add(new Employee(103, "Haritha", 65000, 38, "Female"));
		eSet.add(new Employee(112, "Kavitha", 55000, 32, "Female"));
		eSet.add(new Employee(121, "Samba", 55000, 36, "Male"));
		eSet.add(new Employee(125, "Charan", 5000, 16, "Male"));
		eSet.add(new Employee(225, "Dhruvan", 15000, 12, "Male"));
		// eSet.add(new Employee(325, "Navitha", 15000, 25, "Female"));
		return eSet;
	}

	public static Map<Integer, Employee> getEmployeeMap() {
		Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();

		employeesMap.put(1005, new Employee(121, "kavitha", 30000, 35, "Female"));
		employeesMap.put(1001, new Employee(126, "Yakshitha", 50000, 15, "Female"));
		employeesMap.put(1006, new Employee(125, "Samba", 12000, 38, "Male"));
		employeesMap.put(1000, new Employee(128, "Kruthika", 30000, 07, "Female"));
		employeesMap.put(1002, new Employee(131, "Dhruvan", 45000, 25, "Male"));
		employeesMap.put(2005, new Employee(135, "Thrived", 65000, 25, "Male"));
		employeesMap.put(2040, new Employee(128, "Swathi", 45000, 15, "Female"));
		return employeesMap;

	}
}

package com.corejava.juintbasics.collections;

import java.util.Comparator;

public class SortByNameAndAge implements Comparator<Employee> {

	// To compare employee objects using comparator
	public int compare(Employee emp1, Employee emp2) {
		// Comparing EmployeeNames
		int empNameCompare = emp1.getEmpName().compareTo(emp2.getEmpName());

		if (empNameCompare != 0)
			return empNameCompare;

		return emp1.getAge() - emp2.getAge();
	}
}
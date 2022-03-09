package com.corejava.juintbasics.collections;

import java.util.*;

public class EmpArrayList {

	public static void main(String[] args) {

		List<Employee> empAL = new ArrayList<Employee>();

		empAL = Employee.getEmployeeList();

		// Using for loop we can get employee data
		System.out.println("Employee data before sorting...");
		
		for (int i = 0; i < empAL.size(); i++) {
			System.out.println(empAL.get(i));
		}


		// Sorting Employee entries by id
		Collections.sort(empAL, new SortById());

		System.out.println("\n using comparator Sorted by Employee ID");

		// Again iterating over entries to print them
		for (int i = 0; i < empAL.size(); i++)
			System.out.println(empAL.get(i));
		
        //java 8 we can use this static methods for comparator
		// Comparator.comparing(Employee::getEmpName)
		// .thenComparingInt(Employee::getAge);
		// .thenComparingInt(Employee::getSalary);

		Collections.sort(empAL, new SortByNameAndAge());

		System.out.println("************");
		System.out.println("Using comparator Sorted by Employee Name and age");
		for (Employee emp : empAL) {
			System.out.println(emp.toString());
		}

	}

}

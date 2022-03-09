package com.corejava.juintbasics.collections;

import java.util.*;

public class EmpSet {
	
	public static void main(String[] args) {
		
		Set<Employee> hsEmp = new HashSet<Employee>();
		//TreeSet<Employee> hsEmp = new TreeSet<Employee>(); 
		hsEmp = Employee.getEmployeeSet();
		
		hsEmp = new TreeSet<Employee>(hsEmp);
		Iterator<Employee> itr = hsEmp.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Employee Id Name Salary Age Gender..."  + itr.next());
		}

	}

}

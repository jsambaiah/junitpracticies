package com.corejava.juintbasics.collections;

import java.util.*;

public class EmpSet {
	
	public static void main(String[] args) {
		
		Set<Employee> hsEmp = new HashSet<Employee>();
		//TreeSet<Employee> hsEmp = new TreeSet<Employee>(); 
		
		Employee emp1 = new Employee(121,"kavitha",30000,35,"Female");
		Employee emp2 = new Employee(125,"haritha",40000,38,"Male");
		Employee emp3 = new Employee(122,"Dhruvan",30000,7,"Male");
		Employee emp4 = new Employee(127,"kavitha11",40000,15,"Male");
		Employee emp5 = new Employee(135,"Kruthika",30000,8,"Female");
		Employee emp6 = new Employee(144,"samba",90000,25,"Female");
		Employee emp7 = new Employee(111,"Yakshu",50000,25,"Female");
		
		hsEmp.add(emp1);
		hsEmp.add(emp2);
		hsEmp.add(emp3);
		hsEmp.add(emp4);
		hsEmp.add(emp5);
		hsEmp.add(emp6);
		hsEmp.add(emp7);
		
		//Collections.sort(hsEmp,new SortByNameAndAge());
		Iterator<Employee> itr = hsEmp.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Employee Id Name Salary Age Gender..."  + itr.next());
		}

	}

}

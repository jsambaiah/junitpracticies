package com.corejava.juintbasics.collections;

import java.util.*;

public class EmpHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();

		employeesMap.put(1005, new Employee(121, "kavitha", 30000, 35, "Female"));
		employeesMap.put(1001, new Employee(126, "Yakshitha", 50000, 15, "Female"));
		employeesMap.put(1006, new Employee(125, "Samba", 12000, 38, "Male"));
		employeesMap.put(1010, new Employee(128, "Kruthika", 30000, 07, "Female"));
		employeesMap.put(1000, new Employee(131, "Swathi", 45000, 35, "Female"));

		//System.out.println(employeesMap);


		// Traversing through the HashMap
		for (Map.Entry<Integer, Employee> e : employeesMap.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

}

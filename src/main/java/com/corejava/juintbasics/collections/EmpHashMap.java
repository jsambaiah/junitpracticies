package com.corejava.juintbasics.collections;

import java.util.*;

public class EmpHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> empHMap = new HashMap<Integer, Employee>();
		
		empHMap = Employee.getEmployeeMap();
		
		// Traversing through the HashMap
		for (Map.Entry<Integer, Employee> e : empHMap.entrySet())

			System.out.println(e.getKey() + " " + e.getValue());
	}

}

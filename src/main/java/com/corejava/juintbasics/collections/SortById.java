package com.corejava.juintbasics.collections;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
	public int compare(Employee a, Employee b) {

		return a.empID - b.empID;
	}

}


package com.corejava.juintbasics.collections;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {
	public int compare(Employee a, Employee b) {

		return a.age - b.age;
	}
}
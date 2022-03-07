package com.junitbasics.tests.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.corejava.juintbasics.collections.Employee;

public class EmpSetTest {

	Set<Employee> expectedEmpData = new HashSet<Employee>();

	@Before
	public void initInputs() {

		expectedEmpData.add(new Employee(104, "Yakshitha", 45000, 30, "Female"));
		expectedEmpData.add(new Employee(103, "Haritha", 65000, 38, "Female"));
		expectedEmpData.add(new Employee(112, "Kavitha", 55000, 32, "Female"));
		expectedEmpData.add(new Employee(121, "Samba", 55000, 36, "Male"));
		expectedEmpData.add(new Employee(125, "Charan", 5000, 16, "Male"));
		expectedEmpData.add(new Employee(225, "Dhruvan", 15000, 12, "Male"));
	}

	@Test
	public void compareEmpSetEquals() {
		Set<Employee> TestEmpData = new HashSet<Employee>();
		TestEmpData = Employee.getEmployeeSet();
		Assert.assertEquals(expectedEmpData, TestEmpData);
	}

	@Test
	public void compareEmpSetNotEquals() {
		Set<Employee> TestEmpData = new HashSet<Employee>();
		TestEmpData = Employee.getEmployeeSet();
		expectedEmpData.add(new Employee(525, "Raju", 85000, 12, "Male"));
		Assert.assertNotEquals(expectedEmpData, TestEmpData);
	}
}

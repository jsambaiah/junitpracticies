package com.junitbasics.tests.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.corejava.juintbasics.collections.Employee;
import com.corejava.juintbasics.collections.SortById;

public class EmpArrayListTest {

	List<Employee> expectedEmpData = new ArrayList<Employee>();
	List<Employee> expectedEmpData1 = new ArrayList<Employee>();
	List<Employee> testEmpData = new ArrayList<Employee>();

	@Before
	public void EmpInitInputs() {
		expectedEmpData.add(new Employee(104, "Swathi", 45000, 30, "Female"));
		expectedEmpData.add(new Employee(101, "Haritha", 65000, 38, "Female"));
		expectedEmpData.add(new Employee(102, "Kavitha", 55000, 32, "Female"));
	}

	@Test
	public void EmpALTestPositive() {
		testEmpData = Employee.getEmployeeList();
		Assert.assertEquals(expectedEmpData, testEmpData);
	}

	@Test
	public void EmpALTestNegative() {
		expectedEmpData.add(new Employee(106, "Samba", 15000, 23, "male"));
		testEmpData = Employee.getEmployeeList();
		Assert.assertNotEquals(expectedEmpData, testEmpData);
	}

	@Before
	public void EmpInitInputs1() {
		expectedEmpData1.add(new Employee(101, "Haritha", 65000, 38, "Female"));
		expectedEmpData1.add(new Employee(102, "Kavitha", 55000, 32, "Female"));
		expectedEmpData1.add(new Employee(104, "Swathi", 45000, 30, "Female"));

	}
	@Test
	public void EmpSortByIdTest() {
		testEmpData = Employee.getEmployeeList();
		Collections.sort(testEmpData, new SortById());
		Assert.assertEquals("Sorted Employee data by ID", expectedEmpData1, testEmpData);
	}
}
package com.junitbasics.tests.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.corejava.juintbasics.collections.Employee;

public class EmpMapTest {

	Map<Integer, Employee> expectedEmpData = new HashMap<Integer, Employee>();

	@Before
	public void InitEmpInputs()
	{
	
		expectedEmpData.put(1005, new Employee(121, "kavitha", 30000, 35, "Female"));
		expectedEmpData.put(1001, new Employee(126, "Yakshitha", 50000, 15, "Female"));
		expectedEmpData.put(1006, new Employee(125, "Samba", 12000, 38, "Male"));
		expectedEmpData.put(1000, new Employee(128, "Kruthika", 30000, 07, "Female"));
		expectedEmpData.put(1002, new Employee(131, "Dhruvan", 45000, 25, "Male"));
		expectedEmpData.put(2005, new Employee(135, "Thrived", 65000, 25, "Male"));
		expectedEmpData.put(2040, new Employee(128, "Swathi", 45000, 15, "Female"));
	}
	
	@Test
	public void compareEmpMapEquals()
	{
		Map<Integer, Employee> TestEmpData = new HashMap<Integer, Employee>();
		TestEmpData = Employee.getEmployeeMap();
		
		Assert.assertEquals(expectedEmpData, TestEmpData);
		
		
	}
}

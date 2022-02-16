package com.junitbasics.tests.arrays;

import org.junit.Assert;
import org.junit.Test;

import com.advancejava.junitbasics.arrays.CheckLeapYear;

public class LeapYearTest {

	@Test
	public void leapYrTest()
	{
		Assert.assertTrue(new CheckLeapYear().checkLeapYrORNot(2004));
	}
	
	@Test
	public void nonLeapYrTest()
	{
		Assert.assertFalse(new CheckLeapYear().checkLeapYrORNot(2005));
	}
}

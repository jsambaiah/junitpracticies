package com.junitbasics.tests.arrays;

import org.junit.Assert;
import org.junit.Test;

import com.advancejava.junitbasics.arrays.FindMimMaxArray;

public class MinMaxTestCases {

	@Test
	public void min_success() {
		Assert.assertEquals(2, new FindMimMaxArray().getMinValue(new int[] { 10, 5, 120, 35, 15, 40, 99, 25, 2 }));
	}

	@Test
	public void min_failure() {
		Assert.assertNotEquals(10, new FindMimMaxArray().getMinValue(new int[] { 10, 15, 120, 35, 15, 40, 99, 25, 2 }));
		Assert.assertNotEquals(15, new FindMimMaxArray().getMinValue(new int[] { 10, 15, 120, 35, 15, 40, 99, 25, 2 }));
	}

	@Test
	public void min_negative() {

		Assert.assertEquals(-2, new FindMimMaxArray().getMinValue(new int[] { 10, 15, 120, 35, -2, 40, 99, 25, 2 }));
	}

	@Test
	public void min_zero() {

		Assert.assertEquals(0, new FindMimMaxArray().getMinValue(new int[] { 0, 15, 120, 35, 15, 40, 99, 25, 2 }));
	}

	// Test cases for MaxNumber in the given array.

	@Test
	public void max_success() {
		System.out.print(new FindMimMaxArray().getMaxValue(new int[] { 10, 5, 120, 35, 15, 40, 99, 25, 2 }));
		Assert.assertEquals(120, new FindMimMaxArray().getMaxValue(new int[] { 10, 5, 120, 35, 15, 40, 99, 25, 2 }));
	}

	@Test
	public void max_failure() {
		Assert.assertNotEquals(99, new FindMimMaxArray().getMaxValue(new int[] { 10, 15, 120, 35, 15, 40, 99, 25, 2 }));
		Assert.assertNotEquals(15, new FindMimMaxArray().getMaxValue(new int[] { 10, 15, 120, 35, 15, 40, 99, 25, 2 }));
	}

	@Test
	public void max_negative() {

		Assert.assertEquals(-1, new FindMimMaxArray().getMaxValue(new int[] { -5, -2, -3, -1, -6 }));
	}

	@Test
	public void max_zero() {

		Assert.assertEquals(0, new FindMimMaxArray().getMaxValue(new int[] { -5, -2, 0, -3, -1, -6 }));
	}
}

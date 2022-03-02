package com.junitbasics.tests.arrays;

import org.junit.Test;

import com.advancejava.junitbasics.arrays.TotalSum;

import org.junit.Assert;

public class TotalSumTest {
	
	@Test
	public void get_totalSumPositiveTest() {
		
		Assert.assertEquals(60, new TotalSum().getSumTotal(50, 10));

	}
	
	@Test
	public void get_totalSumNegativeTest() {
		
		Assert.assertEquals(60, new TotalSum().getSumTotal(-50, -10));

	}

	@Test
	public void get_totalSumZeroTest() {
		
		Assert.assertEquals(0, new TotalSum().getSumTotal(-50, 50));

	}

}

package com.junitbasics.tests.arrays;

import org.junit.Assert;
import org.junit.Test;

import com.advancejava.junitbasics.arrays.SortArray;

public class SortArrayTest {
	@Test
	public void get_descArray()
	{
		int[] sortDesc = new SortArray().arrayDesc(new int[]{ 5, 2, 8, 7, 1 });
		Assert.assertArrayEquals(" array sorted in descending order", (new int []{8,7,5,2,1}),sortDesc);
		
	}
	
	@Test
	public void get_ascArray()
	{
		int[] sortAsc = new SortArray().arrayAsc(new int[]{ 5, 2, 8, 7, 1 });
		Assert.assertArrayEquals(" array sorted in ascending order", (new int []{1,2,5,7,8}),sortAsc);
		
	}

}

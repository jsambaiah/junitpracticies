package com.advancejava.junitbasics.arrays;

public class FindMimMaxArray {

	public int getMinValue(int[] numbers) {
		int minValue = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];

			}
		}

		return minValue;
	}

	public int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];

			}
		}

		return maxValue;
	}

}
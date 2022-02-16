package com.advancejava.junitbasics.arrays;

public class CheckLeapYear {

	public boolean checkLeapYrORNot(int year) {

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			return true;
		} else

			return false;
	}

}

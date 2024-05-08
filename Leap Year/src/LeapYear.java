// Program name: Leap Year

// Student name: Jhaymee Bisenio

// Date: 7 April 2024

// Program Description: determines if a year is a leap year

import static java.lang.System.*; 
import java.util.Scanner;


public class LeapYear {

	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public void check(int userYear) {
		if (isLeapYear(userYear)) {
			System.out.println(userYear + " is a leap year.");
		}
		else {
			System.out.println(userYear + " is not a leap year.");
		}

	}
}
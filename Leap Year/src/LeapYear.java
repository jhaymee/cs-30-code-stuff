// Program name: (The name you gave the program)

// Student name: (Your name)

// Date: (The date you completed the program)

// Program Description:

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
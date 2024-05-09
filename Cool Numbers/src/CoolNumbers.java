// Program name: Cool Numbers

// Student name: Jhaymee Bisenio

// Date: 9 May 2024

// Program Description: determines if a number is a cool number (a number that has a remainder of 1 when divided by 3-6) and counts how many cool numbers a range of numbers has

import static java.lang.System.*;

public class CoolNumbers 
{
	
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num ) {
		// int x = 2 < x && x < 7;
		if (num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop ) {
		int i = 6;
		int count = 0;
		for (i = 6; i < stop; i++) {
			if (isCoolNumber(i)) {
				count++;
			}
		}
		return count;
	}
}

// for loop: for (i = 6; i <= num; i++);
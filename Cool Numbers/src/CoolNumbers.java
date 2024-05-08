// Program name: (The name you gave the program)

// Student name: (Your name)

// Date: (The date you completed the program)

// Program Description:

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
			isCoolNumber(i);
			count = stop - i + 1;
		}
		return count;
	}
}

// for loop: for (i = 6; i <= num; i++);
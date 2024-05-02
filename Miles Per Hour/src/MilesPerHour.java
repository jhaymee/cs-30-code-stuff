// Program name: (The name you gave the program)

// Student name: (Your name)

// Date: (The date you completed the program)

// Program Description:

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour() {
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;

	}

	public void setNums(int dist, int hrs, int mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;

	}

	public double calcMPH() {
		minutes = minutes / 60;
		mph = distance / (hours + minutes);
		return calcMPH();
	}

	public void print() {
		System.out.println(distance + " miles in " + hours + " hour(s) and " + minutes + " minutes = " + calcMPH());

	}
}
// Program name: Sum Up Stuff

// Student name: (Your name)

// Date: (The date you completed the program)

// Program Description:

public class Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2) {
		one = num1;
		two = num2;
	}

	public void sum( ) {
		sum = one + two;
	}

	public void print( ) {
		System.out.println("Your total is: " + sum);
	}
}

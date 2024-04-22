// Program name: Sum Up Stuff

// Student name: Jhaymee Bisenio

// Date: 22 April 2024

// Program Description: Adds two numbers together

public class Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2) {
		one = num1;
		two = num2; // makes it so the parameters can be accessed outside this block
	}

	public void sum( ) {
		sum = one + two; // adds numbers
	}

	public void print( ) {
		System.out.println("Your total is: " + sum); // prints sum of numbers
	}
}

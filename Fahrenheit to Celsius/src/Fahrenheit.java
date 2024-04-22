// Program name: Fahrenheit to Celsius

// Student name: Jhaymee Bisenio

// Date: 22 April 2024

// Program Description: Converts fahrenheit to celsius

public class Fahrenheit {
	private double fahrenheit;

	public void setFahrenheit(double fahren) {
		fahrenheit = fahren; // makes fahren accessible
	}

	public double getCelsius() {
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}

	public void print() {
		//this is part of the solution
		System.out.println(fahrenheit + " in celsius is " + getCelsius());
	}
}
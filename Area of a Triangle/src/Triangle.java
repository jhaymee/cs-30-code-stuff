// Program name: Area of a Triangle

// Student name: Jhaymee Bisenio

// Date: 30 April 2024

// Program Description: calculates area of a triangle given the sides

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	// default contructor
	public Triangle() {
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	// initialization constructor
	public Triangle(int a, int b, int c) {
		sideA = a;
		sideB = b;
		sideC = c;

	}

	// method to set the inputs
	public void setSides(int a, int b, int c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}

	// calculates perimeter
	public double calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		return perimeter;
	}

	// calculates area
	public double calcArea( ) {
		double s;
		s = perimeter / 2;
		theArea = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return theArea;
	}



	public void print( ) {
		System.out.println("The perimeter of your triangle is " + calcPerimeter());
		System.out.println("The area of your triangle is " + calcArea());
		System.out.println("\n\n");
	}
}
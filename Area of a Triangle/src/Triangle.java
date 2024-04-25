// Program name: Area of a Triangle

// Student name: Jhaymee Bisenio

// Date: 25 April 2024

// Program Description: calculates area of a triangle given the sides

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle() {
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c) {


	}


	public void setSides(int a, int b, int c) {
		sideA = a;
		sideB = b;
		sideC = c;

	}

	public void calcPerimeter() {
		double p = perimeter;
		p = a + b + c;
		
	}

	public void calcArea( ) {
		double s;


	}

	public void print( ) {


		System.out.println("\n\n");
	}
}
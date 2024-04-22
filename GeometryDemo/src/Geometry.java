// Program name: Geometry Calculator

// Student name: Jhaymee Bisenio

// Date: 22 April 2024

// Program Description: Calculates perimeter, surface area, or area of a circle

public class Geometry {

    public double perimeter(double len, double wid) {
        double pAnswer = 2 * (len + wid);
        System.out.println("The perimeter is " + pAnswer);
        return pAnswer;
    }
    
    public double surfaceArea(double side) {
        double sa = 6 * (side * side);
        System.out.println("The surface area is " + sa);
        return sa;
        
    }

    public double circleArea(double radius) {
        double a = 3.14 * (radius * radius);
        System.out.println("The area of your circle is " + a);
        return a;
    }
}

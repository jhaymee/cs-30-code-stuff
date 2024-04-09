// Program name: Input Basics

// Student name: Jhaymee Bisenio

// Date: 9 April 2024

// Program Description: user inputs integers and doubles, it adds them together

import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in); // Creates scanner

      int intOne, intTwo;
      double doublOne, doublTwo; // declares variables

      System.out.print("Enter an integer : ");
      intOne = keyboard.nextInt(); // reads user input

      System.out.print("Enter an integer : ");
      intTwo = keyboard.nextInt();

      System.out.print("Enter a double : ");
      doublOne = keyboard.nextDouble();

      System.out.print("Enter a double : ");
      doublTwo = keyboard.nextDouble();

      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);
      System.out.println("double one = " + doublOne);
      System.out.println("double two = " + doublTwo); // tells user what the integers/doubles are

      System.out.println(intOne + intTwo); // adds user input integers
      System.out.println(doublOne + doublTwo); // adds user input doubles
    }
}

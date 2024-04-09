// Program name: Input Basics

// Student name: Jhaymee Bisenio

// Date: 9 April 2024

// Program Description: user inputs integers and doubles, it adds them together

import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo;
      double doublOne, doublTwo;

      System.out.print("Enter an integer : ");
      intOne = keyboard.nextInt();

      System.out.print("Enter an integer : ");
      intTwo = keyboard.nextInt();

      System.out.print("Enter a double : ");
      doublOne = keyboard.nextDouble();

      System.out.print("Enter a double : ");
      doublTwo = keyboard.nextDouble();

      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);
      System.out.println("double one = " + doublOne);
      System.out.println("double two = " + doublTwo);

      System.out.println(intOne + intTwo);
      System.out.println(doublOne + doublTwo);
    }
}

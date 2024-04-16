// Program name: Big Or Small

// Student name: Jhaymee Bisenio

// Date: 16 April 2024

// Program Description: Checks parameters and outputs a different result depending on it

import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall {
	public static void check( int a, int b ) {
		if (a > b)
		    System.out.println("yes"); //Answer
        else if (b > a)
            System.out.println("no");
        else 
            System.out.println("equals");
	}
}
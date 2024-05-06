import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner {
	public static void main( String args[] )
	{
		LeapYear test = new LeapYear();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in a year: ");
		int year = keyboard.nextInt();

		test.check(year);
	}
}
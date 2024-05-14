import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int[] outcomes = new int[13];
        int numRolls;
        int result;

        System.out.print("how many rolls (max 13)?");
        numRolls = keys.nextInt();

        // Check if out of bounds
        if (numRolls > 13) {
            numRolls = 13;
        }
        else if (numRolls < 0) {
            numRolls = 1;
        }


        for (int roll = 0; roll < numRolls; roll++) {
            //Rolling "two dice" - note nextInt(x) is a number from 0 <= num < x
            result = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1); 
            outcomes[roll] = result;

            System.out.println("Roll number " + roll + " is " + outcomes[roll]);
        }



    }
}

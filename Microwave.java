/*
* The Microwave program shows how to
*
* @author  matthew sanii
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This is the standard "Hello, World!" program.
*/

final class Microwave {
    /**
    * Variables used for microwave time.
    * Used to show values for code.
    */
    static final int SLOW = 105;
    /**
    * Variable 2.
    */
    static final int FAST = 45;
    /**
    * Variable 3.
    */
    static final int MEDIUM = 60;
    /**
    * Variable 4.
    */
    static final int MIN = 1;
    /**
    * Variable 5.
    */
    static final int MED = 1.5;
    /**
    * Variable 6.
    */
    static final int MAX = 2;
    /**
    * Variable 7.
    */
    static final int MAXI = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        final Scanner food = new Scanner(System.in);
        int time = 0;
        int minutes = 0;
        double heat = 0;
        System.out.print("What are you microwaving(soup, pizza, or sub)? ");

        final String choice = food.nextLine();
        if (choice.toLowerCase().equals("soup")) {
            time = time + SLOW;
        }
        else if (choice.toLowerCase().equals("pizza")) {
            time = time + MEDIUM;
        }
        else if (choice.toLowerCase().equals("sub")) {
            time = time + FAST;
        }
        else {
            System.out.println("that isn't a viable option.");
        }
        System.out.print("How many " + choice.toLowerCase() + " are you cooking?(max 3) ");
        final int amount = food.nextInt();
        if (amount > MAXI) {
            System.out.println("Must be 3 or less.");
        }
        else if (amount < 1) {
            System.out.println("Must be greater than 1.");
        }
        else {
            if (amount == MAX) {
                heat = heat + MED;
            }
            else if (amount == MAXI) {
                heat = heat + MAX;
            }
            else {
                heat = heat + MIN;
            }
            double cooking = heat * time;

            while (cooking > MEDIUM) {
                minutes = minutes + MIN;
                cooking = cooking - MEDIUM;
            }
            System.out.println("it will take " + minutes + " minutes and " + cooking
                + " seconds to cook " + amount + " " + choice.toLowerCase() + "(s).");
        }
        System.out.println("\nDone.");
    }
}

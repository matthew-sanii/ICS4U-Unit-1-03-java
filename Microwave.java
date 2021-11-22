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

        String choice = food.nextLine();
        if (choice.toLowerCase().equals("soup") || choice.toLowerCase().equals("pizza") || choice.toLowerCase().equals("sub")) {
            System.out.print("How many " + choice.toLowerCase() + " are you cooking?(max 3) "); 
            int amount = food.nextInt();
            if (amount > 3) {
                System.out.println("Must be 3 or less.");
            }
            else if (amount < 1) {
                System.out.println("Must be greater than 1.");
            }
            else {
                if (choice.toLowerCase().equals("soup")) {
                    time = 105;
                }
                else if (choice.toLowerCase().equals("pizza")) {
                    time = 45;
                }
                else {
                    time = 60;
                }
                if (amount == 2) {
                    heat = 1.5;
                }
                else if (amount == 3) {
                    heat = 2;
                }
                else {
                    heat = 1;
                }
                double cooking = heat * time;
                while (cooking > 60){
                minutes = minutes + 1;
                cooking = cooking - 60;
}
                System.out.println("it will take " + minutes + " minutes and " + cooking + " seconds to cook " + amount + " " + choice.toLowerCase() + "(s).");
            }
            }
        else {
            System.out.println("that isn't a viable option.");
        }
        System.out.println("\nDone.");
}
}

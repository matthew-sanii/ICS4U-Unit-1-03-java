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

        System.out.print("What are you microwaving? ");

        String choice = food.nextLine();
        if (choice.toLowerCase() == "soup" || choice.toLowerCase() == "pizza" || choice.toLowerCase() == "sub") {
            System.out.print("How many " + choice.toLowerCase() + " are you cooking?(max 3) "); 
            int amount = food.nextInt();
            if (amount == 1) {
                
}
        }
        else {
            System.out.println("that isn't a viable option.");
        }
        System.out.println("you chose " + choice + ".");
        System.out.println("\nDone.");
    }
}

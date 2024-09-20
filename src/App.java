/*
 * Created on 2026-02-06
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// Template code for LAB04
// This template was simplified from LAB03.
import java.util.Scanner;

public class App {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO: Lab Task 2
        // Goal: create at least two Cat objects using promptForCat(),
        // print them, and demonstrate wantsToPlay() + play()

        myScanner.close();
    }

    // TODO: Implement promptForCat()

    // --------------------------------
    // NO NEED TO TOUCH THE CODE BELOW
    // --------------------------------
    static String readUserText(String prompt) {
        System.out.print(prompt + " ");
        return myScanner.nextLine();
    }

    static int readUserNumber(String prompt, int min, int max) {
        int value;

        while (true) {
            System.out.print(prompt + " ");
            value = myScanner.nextInt();
            myScanner.nextLine(); // clear newline token

            if (value < min || value > max) {
                System.out.println("Error: value must be between " + min + " and " + max + ".");
            } else {
                return value;
            }
        }
    }
}

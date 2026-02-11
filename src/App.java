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
        // Create two Cat objects using promptForCat()
        System.out.println("—- CAT 1 —-");
        Cat cat1 = promptForCat();
        System.out.println(cat1);

        System.out.println("—- CAT 2 —-");
        Cat cat2 = promptForCat();
        System.out.println(cat2);

        System.out.println("—");

        // Check if cats want to play and demonstrate play()
        if (cat1.wantsToPlay()) {
            System.out.println(cat1.getName() + " is playing!");
            cat1.play();
            if (cat1.wantsToPlay()) {
                System.out.println(cat1.getName() + " still wants to play!");
            } else {
                System.out.println(cat1.getName() + " is now tired.");
            }
        } else {
            System.out.println(cat1.getName() + " is too tired to play.");
        }

        if (cat2.wantsToPlay()) {
            System.out.println(cat2.getName() + " is playing!");
            cat2.play();
            if (cat2.wantsToPlay()) {
                System.out.println(cat2.getName() + " still wants to play!");
            } else {
                System.out.println(cat2.getName() + " is now tired.");
            }
        } else {
            System.out.println(cat2.getName() + " is too tired to play.");
        }

        myScanner.close();
    }

    // Prompts the user for cat info, creates and returns a Cat object
    static Cat promptForCat() {
        String name = readUserText("What is your cat's name?");
        int age = readUserNumber("How old is " + name + "?", 0, 30);
        String funnyStory = readUserText("Tell me a funny story about " + name + ":");
        int energyLevel = readUserNumber("How energetic is " + name + "?", 0, 10);
        return new Cat(name, age, funnyStory, energyLevel);
    }

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

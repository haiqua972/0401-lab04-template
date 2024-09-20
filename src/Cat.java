/*
 * Created on 2026-02-06
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// Template code for LAB04
/* This template was simplified from LAB03:
 * Methods recommendActivity, classifyAge, and introduceCat do not need to be included.
 * Destroy furniture does not need to be included.
*/
public class Cat {
    // TODO: Lab Task 1

    
    // TODO: Refactor createFunnyStory() after making Cat instantiable
    static String createFunnyStory(String name, String story) {
        return String.format("My cat %s %s.", name, story);
    }
    
    // TODO: Refactor introduceCat() into an instance method and/or toString()
    static String introduceCat(String name, int age, String story, int energyLevel) {
        String summary = "Name: " + name + "\n";
        summary += "Age: " + age + "\n";
        summary += "Story: " + createFunnyStory(name, story) + "\n";
        summary += "Energy: " + energyLevel + "\n";

        return summary;
    }    
}

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
    // Private instance variables (characteristics)
    private String name;
    private int age;
    private String funnyStory;
    private int energyLevel;

    // Constructor
    public Cat(String name, int age, String funnyStory, int energyLevel) {
        this.name = name;
        this.age = age;
        this.funnyStory = funnyStory;
        this.energyLevel = energyLevel;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFunnyStory() {
        return funnyStory;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    // Returns true if energyLevel is above threshold (above 4)
    public boolean wantsToPlay() {
        return energyLevel > 4;
    }

    // Decreases energyLevel by 2 (minimum 0)
    public void play() {
        energyLevel = Math.max(0, energyLevel - 2);
    }

    // Returns a formatted description of the cat
    @Override
    public String toString() {
        return String.format("Cat [name=%s, age=%d, funnyStory=%s, energyLevel=%d]",
                name, age, funnyStory, energyLevel);
    }
}

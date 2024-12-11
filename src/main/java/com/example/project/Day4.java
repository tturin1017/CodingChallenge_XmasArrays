package com.example.project;

import java.util.Random;

public class Day4 {
     // Reindeer class to represent each reindeer in the race
    static class Reindeer {
        String name;
        int speed; // in units per second
        int distanceTraveled;

        // Constructor to initialize reindeer with a name and speed
        public Reindeer(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.distanceTraveled = 0;
        }

        // Simulate the reindeer running for a given number of seconds
        public void runFor(int seconds) {
            distanceTraveled += speed * seconds;
        }

        // Get the current distance traveled by the reindeer
        public int getDistanceTraveled() {
            return distanceTraveled;
        }

        // Get the name of the reindeer
        public String getName() {
            return name;
        }
    }

    // Method to simulate the race and determine the winner
    public static String simulateRace(Reindeer[] reindeers, int raceTime) {
        Random random = new Random();

        // Simulate each reindeer running for the given race time
        for (Reindeer reindeer : reindeers) {
            reindeer.runFor(raceTime); // Run for the specified raceTime
        }

        // Find the reindeer that traveled the farthest
        Reindeer winner = reindeers[0];
        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }

        return winner.getName(); // Return the name of the winner
    }

    public static void main(String[] args) {
        // Create some reindeer with random speeds
        Reindeer[] reindeers = {
            new Reindeer("Rudolph", 5),
            new Reindeer("Dasher", 6),
            new Reindeer("Dancer", 4),
            new Reindeer("Prancer", 7),
            new Reindeer("Vixen", 8)
        };

        // Run the race for 10 seconds
        int raceTime = 10;
        String winner = simulateRace(reindeers, raceTime);

        System.out.println("The winner is: " + winner);
    }
}

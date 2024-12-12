package com.example.project;

import java.util.Random;

public class Day4 {
     // Reindeer class to represent each reindeer in the race
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    private static class Reindeer {
        private String name;
        private int speed; // in units per second
        private int distanceTraveled;
        private int runDur;
        private int restDur;
        private int timeLeft;
        private boolean isRunning;

        // Constructor 
        public Reindeer(String name, int speed, int runDur, int restDur) {
            this.name = name;
            this.speed = speed; //feet per second
            this.runDur = runDur; //seconds
            this.restDur = restDur; 
            this.timeLeft = runDur;
            this.isRunning = true;
        }

        public String getName(){
            return this.name;
        }
        

        public void simulateSecond(){
            if(isRunning){
                distanceTraveled+=speed;
            }
            timeLeft--;
            if(timeLeft == 0){//done running or resting
                isRunning = !isRunning; //switch to new rest or running time
                if(isRunning){ //if running now, timeleft is the run duration
                    timeLeft = runDur;
                }else{
                    timeLeft = restDur;
                }
            }
        }

        
    }

 
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

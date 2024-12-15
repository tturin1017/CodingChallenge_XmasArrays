package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute


        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
        }

        public int getDistanceTraveled(){ // this method is required
            return 0;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        return "name of winner";
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}




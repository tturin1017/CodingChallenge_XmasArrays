package com.example.project;
import java.util.Random;

public class Day4 {
     // Reindeer class to represent each reindeer in the race
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer {
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
            this.distanceTraveled = 0;
        }

        public String getName(){
            return this.name;
        }
        public void getInfo(){
            System.out.println("Name= "+this.name+ "\nSpeed = "+this.speed+"\nrun duration="+this.runDur+ "\nrest duration="+this.restDur+"\nDistance Traveled="+this.getDistanceTraveled()+"\n");
        }

        public int getDistanceTraveled(){
            return this.distanceTraveled;
        }
        

        public void simulateSecond(){
            if(isRunning){
                this.distanceTraveled+=speed;
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

    public static void createReindeers(){
        Random r = new Random();
        Reindeer[] reindeers = new Reindeer[reindeer_names.length];
        //create reindeers
        for(int i=0;i<reindeer_names.length;i++){
            //create a new reindeer and add it to reindeer list
            reindeers[i]=new Reindeer(reindeer_names[i],r.nextInt(401)+100,r.nextInt(60)+1,r.nextInt(60)+1);
           
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers){
        String winner = "";
        int max = 0;
        for(int i=0; i<time;i++){ // each iteration is a second
            for(int j=0;j<reindeers.length;j++){ //loop through each reindeer to simulate a second
                reindeers[j].simulateSecond();
            }

            if(i==time-1){ //after end of last second, deteremine which reindeer got the farthest
                for(Reindeer reindeer: reindeers){
                    reindeer.getInfo();
                    if(reindeer.getDistanceTraveled()>max){
                        winner=reindeer.getName();
                        max=reindeer.getDistanceTraveled();
                    }

                }
            }
        }
        return winner;
    }
    public static void main(String[] args) {

    }

 
}




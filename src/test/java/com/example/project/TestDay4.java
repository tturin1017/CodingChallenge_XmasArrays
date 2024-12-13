// package com.example.project;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// public class TestDay4 {

//     @Test
//     public void testReindeerRace() {
//         // Create some reindeer with predefined speeds
//         Day4.Reindeer[] reindeers = {
//             new Day4.Reindeer("Rudolph", 5),
//             new Day4.Reindeer("Dasher", 6),
//             new Day4.Reindeer("Dancer", 4),
//             new Day4.Reindeer("Prancer", 7),
//             new Day4.Reindeer("Vixen", 8)
//         };

//         // Simulate the race for 10 seconds
//         int raceTime = 10;
//         String winner = Day4.simulateRace(reindeers, raceTime);

//         // We know that Vixen should be the winner (8 speed * 10 seconds = 80 distance)
//         assertEquals("Vixen", winner, "The winner should be Vixen");
//     }
// }

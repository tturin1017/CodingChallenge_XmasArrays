package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) {
        if (size % 2 == 0) { //must be odd
            return null;
        }

        String[][] grid = new String[size][size];

        // Initialize grid with hypehns this will create a size by size grid 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = " ";
            }
        }

        // Calculate the center of the grid
        int mid = size / 2;

        //Draw vertical arm
        for(int i=0;i<size;i++){
            grid[i][mid]="*";
        }

        //Draw horizontal arm
        for(int i=0;i<size;i++){
            grid[mid][i]="*";
        }

        //draw left diagonal (top-left to bottom-right)
        for(int i=0;i<size;i++){
            grid[i][i]="*";
        }

        //draw right diagonal (top-right to bottom-left)
        for(int i=0;i<size;i++){
            grid[i][(size-1)-i]="*";
        }

        return grid;
    }

    // Prints the snowflake in ASCII
    public static void printSnowflake(String[][] snowflake) {
        for (String[] row : snowflake) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
        int size = 7; // Choose odd size for symmetry
        String[][] snowflake = generateSnowflake(size);
        String[][] check = {
            {"*"," "," ","*"," "," ","*"},
            {" ","*"," ","*"," ","*"," "},
            {" "," ","*","*","*"," "," "},
            {"*","*","*","*","*","*","*"},
            {" "," ","*","*","*"," "," "},
            {" ","*"," ","*"," ","*"," "},
            {"*"," "," ","*"," "," ","*"}
                        };
        printSnowflake(snowflake);
        System.out.println();
        printSnowflake(check);
    }
}

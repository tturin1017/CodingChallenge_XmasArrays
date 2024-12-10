/* Day 1 - Elf Name generator 
 * Create an elf name generator.
 * You will need a public class Day1{}.
 * Within the class you will need  a static String array that contains elf names
 * Within the class you will need a static method that returns a String called generateElfName with one parameter, String name -> generateElfName(String name)
*/
package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
    public static String generateElfName(String name){
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("Name cannot be null or empty"); // add to instructions 
        }
        Random r = new Random();
        return elf_names[r.nextInt(elf_names.length)] + " " + name;
        
    }
}
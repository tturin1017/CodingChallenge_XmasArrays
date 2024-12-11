
package com.example.project;
import java.util.Random;
public class Day2{
    private static String[] names = {"John","Matt","Lucy","Nina","Roxy","Andrew","Henry","Donnie","Sasha","Mohammad","Elsa","Ruby"};
    private static String[] nn = {"naughty", "nice"};
    public static String[][] nameSort(String[] names){
        Random r = new Random();
   
        String [] nice_list = new String[12];
        int nice_index = 0;
        String [] naughty_list = new String[12];
        int naughty_index = 0;
        String nice_or_naughty = "";
        for(int i=0; i<names.length;i++){
            nice_or_naughty = nn[r.nextInt(2)];
            if(nice_or_naughty.equals("nice")){
                nice_list[nice_index]=names[i];
                nice_index++;
            }else{
                naughty_list[naughty_index]=names[i];
                naughty_index++;
            }
        }
        String [][] answer = new String[2][];
        answer[0] = nice_list;
        answer[1] = naughty_list;
        return answer;
    }

    // public static void main(String[] args) {
    //     String[][] result = Day2.nameSort(names);
    //     for(String item : result[0]){
    //         System.out.println(item);
    //     }
    // }
}
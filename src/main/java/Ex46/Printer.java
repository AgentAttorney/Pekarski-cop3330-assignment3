package Ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Map;

public class Printer {
    public void printSortMap(Map<String, Integer> hashmap) {
        for(Map.Entry<String,Integer> en: hashmap.entrySet()){
            System.out.print(en.getKey() + " ");
            int integer = en.getValue();
            for(int i=0;i<integer;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

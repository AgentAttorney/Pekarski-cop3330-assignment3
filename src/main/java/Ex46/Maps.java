package Ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.*;

public class Maps {

    public boolean createMap(Map<String, Integer> my_map, String text) {

        // Splits each sentence, and for each word, two conditions
        // 1. If map has no key of word name, make key and value
        // 2. Increment Value for word name Key

        String[] tokens = text.split(" ");
        for(String token: tokens){
            String word = token.toLowerCase();
            if(my_map.containsKey(word)){
                int count = my_map.get(word);
                my_map.put(word,count+1);
            }
            else{
                my_map.put(word,1);
            }
        }
        return true;
    }

    public HashMap<String, Integer> displayMap(Map<String, Integer> my_map) {
        // Takes map entries into a List, sorts them with a custom method by val, and rewrites to Hashmap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String,Integer>>(my_map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue()).compareTo(o1.getValue());
                    }
                });
            HashMap<String, Integer> sortHash = new LinkedHashMap<String,Integer>();
            for(Map.Entry<String,Integer> aa : list){
                sortHash.put(aa.getKey(),aa.getValue());
            }
            return sortHash;
    }
}

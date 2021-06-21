package Ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAnalysis {
    public void decompose(List<String> fileList) {
        // For every sentence, sends to createMap which splits the text and writes the Map
        boolean Junit_truth;
        Maps map_functions = new Maps();
        Printer print_hash_u_map = new Printer();
        Map<String,Integer> my_map = new HashMap<>();
        for (String text : fileList) {
            Junit_truth = map_functions.createMap(my_map, text);
        }
        Map<String,Integer> Hashmap = map_functions.displayMap(my_map);
        print_hash_u_map.printSortMap(Hashmap);

    }
}

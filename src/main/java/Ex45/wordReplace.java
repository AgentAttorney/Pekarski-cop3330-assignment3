package Ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;

public class wordReplace {
    public List<String> replaceWord(ArrayList<String> al) {
        // makes a new AL and copies the values from the old list while replacing "utilize"
        List<String> retAL = new ArrayList<>();
        for(String s: al){
            retAL.add(s.replace("utilize","use"));
        }
        return retAL;
    }
}

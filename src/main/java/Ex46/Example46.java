package Ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.List;

public class Example46 {
    public static void main(String[] args){
        fileReader read_input = new fileReader();
        List<String> FileList;
        ListAnalysis analyze_list = new ListAnalysis();
        FileList = read_input.readFile();
        analyze_list.decompose(FileList);
    }
}

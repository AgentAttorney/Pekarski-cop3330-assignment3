package Ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.ArrayList;
import java.util.List;

public class manageList {
    List<String> fileList = new ArrayList<String>();
    Printer printArrays = new Printer();

    public void addToList(String text) {
        fileList.add(text);
    }
    public List<String> getList(){
        return fileList;
    }

    public String[][] splitList() {

        // Each Sentence gets split up into an Array of Words
        // Each of these Arrays go into a 2D array of Strings

        String[][] arrayStrings = new String[fileList.size()][];
        for(int i=0;i<fileList.size();i++){
            arrayStrings[i] = fileList.get(i).split(","); // This should work
        }
        return arrayStrings;
    }

    public void callPrinter(String[][] arrays){
        printArrays.formatPrintTheList(arrays, fileList.size());
    }
}

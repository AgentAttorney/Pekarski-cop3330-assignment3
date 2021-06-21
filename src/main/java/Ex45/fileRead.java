package Ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileRead {
    public List<String> readFile(File inputFile) {

        // read File text into arrayList
        // passes that arraylist into an instance of wordReplace
        // wordReplace returns a new ArrayList

        List<String> AL = new ArrayList<>();
        List<String> retAL;
        wordReplace wr = new wordReplace();
        String text;
        try{
            Scanner file_scan = new Scanner(inputFile);
            while(file_scan.hasNextLine()){
                text= file_scan.nextLine();
                AL.add(text);
            }
            file_scan.close();
        }
        catch(IOException e){
            System.out.println("File Not Found for some reason.");
        }
        retAL = wr.replaceWord((ArrayList<String>) AL);
        return retAL;
    }
}

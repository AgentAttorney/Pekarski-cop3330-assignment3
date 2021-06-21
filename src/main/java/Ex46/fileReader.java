package Ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileReader {
    public List<String> readFile() {
        // scans file and add it to List
        String text;
        List<String> Filelist = new ArrayList<String>();
        try {
            File read_file = new File("FileInput/Ex46/exercise46_input.txt");
            Scanner file_scan = new Scanner(read_file);
            while(file_scan.hasNextLine()){
                text = file_scan.nextLine();
                Filelist.add(text);
            }
            file_scan.close();
        }
        catch(IOException e){
            System.out.println("File could not be read. ");
        }
        return Filelist;
    }
}

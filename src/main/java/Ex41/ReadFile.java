package Ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public boolean FileRead() {

        // Create a File Scanner and a List of Strings called Names
        // In a while loop, read the input file and add each line/name to Name
        // After the file is complete, close the File Scanner

        List<String> Names = new ArrayList<String>();
        String text;
        try {
            File file_to_scan = new File("FileInput/Ex41/exercise41_input.txt");
            Scanner file_scan = new Scanner(file_to_scan);
            while(file_scan.hasNextLine())
            {
                text = file_scan.nextLine();
                Names.add(text);
            }
            file_scan.close();
        }
        catch(FileNotFoundException FE)
        {
            System.out.println("File Not Found. Check the Directory.");
        }

        // Create a ManageList object initialized with the List
        // Run SortList on the List

        ManageList namesList = new ManageList();
        List<String> was_sorted = namesList.SortList(Names);
        // Create a Printer Object in ManageList Object
        // Have the Printer object run PrintTheList using the value from getList()
        return true;
    }
}

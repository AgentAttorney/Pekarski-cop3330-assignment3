package Ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public boolean fileRead()
    {
        boolean truth = false;
        manageList bigList = new manageList();
        String text;
        try
        {
            File file_to_scan = new File("FileInput/Ex42/exercise42_input.txt");
            Scanner scan_file = new Scanner(file_to_scan);
            while(scan_file.hasNextLine())
            {
                // takes in sentence by sentence and adds to a List
                text = scan_file.nextLine();
                bigList.addToList(text);
            }
            scan_file.close();
            truth = true;

        }
        catch(FileNotFoundException FE)
        {
            System.out.println("File not found. Check the directory.");
        }
        String[][] arrays = bigList.splitList();
        bigList.callPrinter(arrays);
        return truth;
    }
}

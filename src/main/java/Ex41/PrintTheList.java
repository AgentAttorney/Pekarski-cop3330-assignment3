package Ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintTheList {
    public boolean printNames(List<String> names) {
        try {
            FileWriter name_writer = new FileWriter("FileOutPut/Ex41/Exercise41output.txt");
            name_writer.write("Total of " + names.size() + " names.\n---------------\n");
            for (int i = 0; i < names.size(); i++) {
                name_writer.write(names.get(i) + "\n");
            }
            name_writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("A critical error has occurred.");
        }
        return false;
    }
}

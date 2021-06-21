package Ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Formatter;

public class Printer {
    public void formatPrintTheList(String[][] arrays, int size) {
        Formatter file_format = new Formatter();
        System.out.println("Last\t\tFirst\t\tSalary");
        for(int i=0;i<size;i++)
        {
            // Formats each row individually
            file_format.format("%-12s%-12s%-12s%n",arrays[i][0],arrays[i][1],arrays[i][2]);
        }
        System.out.print(file_format);
    }
}

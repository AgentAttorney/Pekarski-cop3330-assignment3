package Ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;

public class createFile {
    public File createOutput(String outFileName) {
        File out_File = new File(outFileName);
        return out_File;
    }
}

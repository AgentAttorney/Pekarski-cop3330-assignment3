package Ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class fileWrite {
    public boolean writeFile(File outputFile, List<String> al) {
        try {
            FileWriter sentence_writer = new FileWriter(outputFile);
            for(int i=0;i<al.size();i++) {
                sentence_writer.write(al.get(i));
                sentence_writer.write("\n");
            }
            sentence_writer.close();
            return true;
        }
        catch(IOException e){
            System.out.println("Did not have outputFile.");
        }
        return false;
    }
}

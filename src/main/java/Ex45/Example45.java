package Ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.util.List;

public class Example45 {
    public static void main(String[] args){
        List<String> AL;
        input newInput = new input();
        String outFileName = newInput.returnInput();

        createFile newOutFile = new createFile();
        File outputFile = newOutFile.createOutput(outFileName);

        fileRead readTheFile = new fileRead();
        File inputFile = new File("FileInput/Ex45/exercise45_input.txt");
        AL = readTheFile.readFile(inputFile); // Now time to write to outputFile

        fileWrite writeFile = new fileWrite();
        writeFile.writeFile(outputFile,AL);

    }
}

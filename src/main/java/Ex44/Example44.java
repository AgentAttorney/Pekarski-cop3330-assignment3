package Ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.List;

public class Example44 {
    public static void main(String[] args){
        // Create all Class Instances and vars I need
        JsonFileReader jfr = new JsonFileReader();
        Input search = new Input();
        DoesExist de = new DoesExist();
        Output op = new Output();
        boolean DE = false;

        // get the product List
        List<products> productsList = jfr.readFile();
        while(!DE) {
            String search_product = search.readInput();

            // get product info if it exists, returns null if DNE
            products Exists = de.doesProductExist(productsList, search_product);
            if(Exists != null)
                DE = true;
            if (DE) {
                op.printOutput(Exists);
                break;
            }
        }
    }
}

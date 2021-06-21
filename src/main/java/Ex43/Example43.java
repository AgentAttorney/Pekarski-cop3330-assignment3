package Ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example43 {
    public static void main(String[] args){
        Input strings_input = new Input();
        FileCreation fc = new FileCreation();
        String[] input = strings_input.takeInput();
        fc.runMethods(input);
    }
}

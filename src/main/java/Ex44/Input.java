package Ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class Input {
    public String readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the product name?");
        String search = input.next();
        return search;
    }
}

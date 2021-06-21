package Ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class input {
    public String returnInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the output file name");
        String fileName = input.next();
        return fileName;
    }
}

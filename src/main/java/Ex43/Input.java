package Ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Scanner;

public class Input {
    public String[] takeInput() {
        Scanner scan_input = new Scanner(System.in);
        String[] ret_input = new String[4];

        System.out.print("Enter the name of the site. ");
        ret_input[0] = scan_input.next(); // sites cannot have spaces in URLS

        System.out.print("Enter the author name. ");
        ret_input[1] = scan_input.next();

        System.out.print("Enter \"yes\" or \"no\" for including JSS and CSS folders. ");
        ret_input[2] = scan_input.next();
        ret_input[3] = scan_input.next();

        return ret_input;
    }
}

package Ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.Collections;
import java.util.List;



// Create a Printer Object in ManageList Object
// Have the Printer object run PrintTheList using the value from getList()

public class ManageList {
    PrintTheList format_print = new PrintTheList();
    private List<String> names;
    public List<String> SortList(List<String> names) {
        Collections.sort(names);
        setNames(names);
        boolean print_names = format_print.printNames(getNames());
        return names;

    }
    public void setNames(List<String> names)
    {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}

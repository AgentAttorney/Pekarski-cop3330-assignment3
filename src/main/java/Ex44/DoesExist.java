package Ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.List;

public class DoesExist {
    public products doesProductExist(List<products> productsList, String search_product) {
        // check if product exists using name
        for(products product: productsList){
            if(product.name.equals(search_product)){
                return product; // return the product info
            }
        }
        return null; // product DNE
    }
}

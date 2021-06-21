package Ex44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonFileReader {
    public List<products> readFile() {
        // Make file input
        File input = new File("FileInput/Ex44/exercise44_input.json");

        try {
            // Convert file elements from Json to Json Objects
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            // Convert Json objects to Array of Json Products
            JsonArray jsonArrOfProducts = fileObject.get("products").getAsJsonArray();
            // Have a list of products we return
            List<products> productList = new ArrayList<>();

            // For each element in Json ArrayOfProducts
            for(JsonElement productElement: jsonArrOfProducts) {
                // get each element as JSON Object
                JsonObject productJsonObject = productElement.getAsJsonObject();

                // Extract data from each object into temp-like variables
                String name = productJsonObject.get("name").getAsString();
                double price = productJsonObject.get("price").getAsDouble();
                int quantity = productJsonObject.get("quantity").getAsInt();

                // Make new instance of class products that accepts the data
                products product = new products(name,price,quantity);

                // Add each to the List we return
                productList.add(product);
            }
            return productList;
        }
        catch(IOException e){
            System.out.print("Likely not JSON File, or the format is incorrect.");
        }
        return null; // Shouldn't ever get here
    }
}

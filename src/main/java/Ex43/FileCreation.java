package Ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public void runMethods(String[] input) {
        String initialPath = makeBaseFolder(input[0]);
        String trueHTML= makeHTML(input[0],input[1],initialPath);
        boolean blJS = convertStringToBool(input[2]);
        boolean blCSS = convertStringToBool(input[3]);
        String madeJS = makeJS(blJS,initialPath);
        String madeCSS = makeCSS(blCSS,initialPath);
    }

    public String makeCSS(boolean blCSS, String path) {
        // // Makes a CSS Folder and configures the path

        if(blCSS){
            String fpath = path + "/" + "css/";
            File nFile = new File(fpath);
            boolean ret = nFile.mkdirs();
            return fpath;
        }
        else
            return path;
    }

    public String makeJS(boolean blJS,String path) {
        // Makes a JS Folder and configures the path

        if(blJS){
            String fpath = path + "/" + "js/";
            File nFile = new File(fpath);
            boolean ret = nFile.mkdirs();
            return fpath;
        }
        else
            return path;
    }

    private boolean convertStringToBool(String JS_CSS) {
        // converts user input to boolean that program can use
        if(JS_CSS.equals("yes") || JS_CSS.equals("y"))
            return true;
        else
            return false;
    }

    public String makeHTML(String title, String author,String path) {
        // makes an Empty .HTML File and modifies the path to the base Folder
        boolean ret_bool = false;
        String modPath  = path + "/" + "index" + ".html";
        File html = new File(modPath);
        try {
            // check if file exists, and if does, modify the html file
            if (html.createNewFile()) {
                ret_bool = true;
            } else {
                System.out.println("File already exists.");
                ret_bool = false;
            }
            if(ret_bool)
                ret_bool = modifyHTML(html,modPath,title,author);
        }
        catch(IOException e){
            System.out.print("HTML could not be created properly");
        }
        return modPath;
    }

    public boolean modifyHTML(File html, String modPath, String title, String author) throws IOException {
        // modifies the content inside the HTML_format with the user data and writes it to the file

        String html_format = "<html><head><meta name=\"author\" content=\"" + author +
                "\"><title>" + title + "</title>" + title+ "</head><body><p>" +
                "The title is" + title + " and the author is " + author + "</p></body></html>";
        try {
            FileWriter fw = new FileWriter(html);
            fw.write(html_format);
            fw.close();
            return true;
        }
        catch(IOException e){
            System.out.println("Modifying HTML did not work.");
        }
        return false;
    }

    public String makeBaseFolder(String title) {

            // Makes Base folder where html and optional folders go

            String path = "FileOutPut/Ex43/" + title;
            File nFile = new File(path);
            boolean ret = nFile.mkdirs();
            return path;
    }
}

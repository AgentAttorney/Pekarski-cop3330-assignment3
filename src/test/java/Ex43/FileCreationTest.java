package Ex43;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileCreationTest {
    FileCreation fc = new FileCreation();
    @Test
    public void does_base_folder_create_in_right_location_and_have_same_name(){
        String title = "TitleOfPage";
        String path = "FileOutPut/Ex43/" + title;
        assertEquals(path,fc.makeBaseFolder(title));
    }

    @Test
    public void does_HTML_create_in_right_location_and_have_same_name() {
        String title = "TitleOfPage";
        String path = "FileOutPut/Ex43/"+ title + "/" + "index.html";
        assertEquals(path,fc.makeHTML(title,"author","FileOutPut/Ex43/"+ title));
    }

    @Test
    public void makeJS_True() {
        String path = "FileOutPut/Ex43/" + "TitleOfPage";
        assertEquals(path + "/js/",fc.makeJS(true,path));
    }
    @Test
    public void makeJS_False() {
        String path = "FileOutPut/Ex43/" + "TitleOfPage";
        assertEquals(path,fc.makeJS(false,path));
    }

    @Test
    public void makeCSS_True() {
        String path = "FileOutPut/Ex43/" + "TitleOfPage";
        assertEquals(path + "/css/",fc.makeCSS(true,path));
    }
    @Test
    public void makeCSS_False() {
        String path = "FileOutPut/Ex43/" + "TitleOfPage";
        assertEquals(path,fc.makeCSS(false,path));
    }

    @Test
    public void modifyHTML() throws IOException {
        String modPath  = "FileOutPut/Ex43/" + "index.html";
        File html = new File(modPath);
        assertEquals(true,fc.modifyHTML(html,modPath,"TitleOfPage","author"));
    }
}
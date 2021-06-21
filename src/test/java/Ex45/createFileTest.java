package Ex45;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class createFileTest {

    @Test
    public void createOutput() {
        createFile cf = new createFile();
        String output_name = "FileOutPut/Ex45/";
        File file = new File(output_name);
        assertEquals(file,cf.createOutput(output_name));
    }
}
package Ex45;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class fileWriteTest {

    @Test
    public void writeFile_returns_an_AL_with_entries() {
        fileWrite fw = new fileWrite();
        ArrayList<String> AL = new ArrayList<>();
        AL.add("Hello");
        AL.add(" World");
        File outputFile = new File("FileOutPut/Ex45/exercise45_output.txt");
        assertEquals(true,fw.writeFile(outputFile,AL));
    }
}
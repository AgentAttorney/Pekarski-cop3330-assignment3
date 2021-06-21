package Ex42;

import Ex41.ReadFile;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadFileTest {

    @Test
    public void file_was_read() {
        ReadFile rf = new ReadFile();
        boolean read_file = (rf.FileRead());
        assertTrue(read_file);
    }
}

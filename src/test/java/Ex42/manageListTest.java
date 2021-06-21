package Ex42;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class manageListTest {

    @Test
    public void Does_Program_Return_2D_Array_Strings() {
        manageList ml = new manageList();
        assertTrue(ml.splitList() != null);
    }
    @Test
    public void Can_Program_Split_Correctly(){
        List<String> base_list = Arrays.asList(new String[]{"Hello,world,how are,you today"});
        manageList ml = new manageList();
        for(String s: base_list){
            ml.addToList(s);
        }
        String[][] expected = new String[1][4];
        expected[0][0] = "Hello";
        expected[0][1] = "world";
        expected[0][2] = "how are";
        expected[0][3] = "you today";
        ml.splitList();
        assertArrayEquals(expected,ml.splitList());
    }
}
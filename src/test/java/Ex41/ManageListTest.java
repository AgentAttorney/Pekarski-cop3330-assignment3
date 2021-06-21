package Ex41;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ManageListTest {
    @Test
    public void was_the_list_sorted()
    {
        List<String> names_to_print = Arrays.asList(new String[]{"Abc", "easy", "as", "123"});
        ManageList ml = new ManageList();
        Collections.sort(names_to_print);
        List<String> sorted_list = ml.SortList(names_to_print);
        assertEquals(names_to_print,sorted_list);
    }
    @Test
    public void was_the_list_sorted_Large_Case()
    {
        List<String> names_to_print = Arrays.asList(new String[]{"Abc", "easy", "as", "123","Do","Re","Mi","Jackson","Five","Rocky","The"});
        ManageList ml = new ManageList();
        Collections.sort(names_to_print);
        List<String> sorted_list = ml.SortList(names_to_print);
        assertEquals(names_to_print,sorted_list);
    }
}

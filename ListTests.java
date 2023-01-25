import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests implements StringChecker {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("kit");
        input1.add("eirene");
        input1.add("joga");
        input1.add("blue");
        input1.add("wreevo");
        assertArrayEquals(input1.toArray(), (ListExamples.filter(input1, new StringChecker())).toArray());
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        List<String> input2 = new ArrayList<String>();
        input1.add("kit");
        input2.add("eirene");
        input1.add("joga");
        input2.add("blue");
        input1.add("wreevo");
        List<String> output = new ArrayList<String>();
        output.add("blue");
        output.add("eirene");
        output.add("joga");
        output.add("kit");
        output.add("wreevo");
        assertArrayEquals(output.toArray(), (ListExamples.merge(input1, input2)).toArray());
        
    }

}
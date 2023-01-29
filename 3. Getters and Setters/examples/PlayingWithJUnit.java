package examples;

import examples.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayingWithJUnit {

    @Test
    public void testName() throws Exception{
        assertEquals(4, Calculator.add(2,2));
        assertEquals(9, Calculator.add(4,4));
    }
}

package Calculate;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void bmi() throws Exception {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }

}
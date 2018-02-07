package noboringzeros;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoBoringTest {
    @Test
    public void noBoringZeros() throws Exception {
        assertEquals(145,NoBoring.noBoringZeros(1450));
        assertEquals(NoBoring.noBoringZeros(960000000), 96);
        assertEquals(NoBoring.noBoringZeros(1050), 105);
        assertEquals(NoBoring.noBoringZeros(-1050), -105);

    }

}
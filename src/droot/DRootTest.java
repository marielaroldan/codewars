package droot;

import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {
    @Test
    public void digitalRoot(){
        assertEquals(7,DRoot.digitalRoot(16));
        assertEquals(6,DRoot.digitalRoot(942));
        assertEquals(6,DRoot.digitalRoot(132189));
        assertEquals(2,DRoot.digitalRoot(493193));
        assertEquals(2,DRoot.digitalRoot(155));
    }

    @Test
    public void sumofDigit2() throws Exception {
        assertEquals(7,DRoot.sumOfDigits2(16));
        assertEquals(6,DRoot.sumOfDigits2(942));
        assertEquals(6,DRoot.sumOfDigits2(132189));
        assertEquals(2,DRoot.sumOfDigits2(493193));
        assertEquals(2,DRoot.sumOfDigits2(155));
    }
}
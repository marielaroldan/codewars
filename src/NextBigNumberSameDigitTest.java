import org.junit.Test;

import static org.junit.Assert.*;

public class NextBigNumberSameDigitTest {
    @Test
    public void newBiggerNumber() throws Exception {

//        verificar(-1, 9);
//        verificar(-1, 111);
//        verificar(-1, 531);
        verificar(531, 513);
        //verificar(1478522485, 1478522458);
//        verificar(21, 12);
//        verificar(2071, 2017);
//        verificar(441, 414);
//        verificar(414, 144);
    }

    private void verificar(long expected, long actual) {
        assertEquals(expected, NextBigNumberSameDigit.nextBiggerNumber(actual));
    }

}
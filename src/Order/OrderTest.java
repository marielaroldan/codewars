package Order;

import org.junit.Test;

import static org.junit.Assert.*;


public class OrderTest {
    @Test
    public void order() throws Exception {
        //assertEquals("Thi1s is2 3a T4est",Order.order("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople",Order.order("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("", Order.order("Empty input should return empty string"));
    }

    @Test
    public void lookForNumber(){
        assertEquals(1,Order.lookForNumber("Mari1ela"));
        assertEquals(2,Order.lookForNumber("Ma2riela"));
        assertEquals(3,Order.lookForNumber("Mari3ela"));
        assertEquals(4,Order.lookForNumber("4Mariela"));
        assertEquals(5,Order.lookForNumber("Mariela5"));
    }

}
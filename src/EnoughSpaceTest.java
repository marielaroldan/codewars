import org.junit.Test;

import static org.junit.Assert.*;

public class EnoughSpaceTest {

    @Test
    public void enoughTest(){
        assertEquals(0,EnoughSpace.enough(10,5,5));
        assertEquals("Should return 10.", 10, EnoughSpace.enough(100, 60, 50));
        assertEquals("Should return 10.", 10, EnoughSpace.enough(100, 60, 50));

    }

}
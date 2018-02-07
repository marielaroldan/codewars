import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {
    @Test
    public void print() throws Exception {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");
        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void addSpace() throws Exception {
//        System.out.printf("*" + Diamond.addSpace(1) + "*");
    }

    @Test
    public void addStars() throws Exception {
    }

}
package representation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class RepresentationTest {
    @Test
    public void testRepresentation() {
        Representation rep = new Representation();
        assertEquals(17,rep.dayRepresented(new int[][] {{10,15},{25,35}}));
        assertEquals(24,rep.dayRepresented((new int[][] {{2,8},{220,229},{10,16}})));
        assertEquals(175,rep.dayRepresented((new int[][] {{4,5},{229,1},{55,90}})));
        assertEquals(41,rep.dayRepresented((new int[][] {{2,8},{220,229},{10,16},{10,15},{25,35}})));
    }
}
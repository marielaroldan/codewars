package LinkedList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinkedfyTest {
    @Test
    public void sampleTests() {
        assertEquals("1 -> 2 -> 3 -> null", Linkedfy.stringify(new Node(1, new Node(2, new Node(3)))));
        assertEquals("0 -> 1 -> 4 -> 9 -> 16 -> null", Linkedfy.stringify(new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))));
        assertEquals("null", Linkedfy.stringify(null));
    }

}
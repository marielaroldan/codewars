package DuplicateEncoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {
    @Test
    public void encode() throws Exception {

        assertEquals(")()())()(()()(",DuplicateEncoder.encode("Prespecialized"));
        assertEquals("()()()",DuplicateEncoder.encode("recede"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
        assertEquals(")())())",DuplicateEncoder.encode("Success" ));
        assertEquals("))((",DuplicateEncoder.encode("(( @"));

    }

}
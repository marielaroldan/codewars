import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void isDigit() throws Exception {
        assertFalse(RegularExpresions.isDigit(""));
        assertTrue(RegularExpresions.isDigit("7"));
        assertFalse(RegularExpresions.isDigit(" "));
        assertFalse(RegularExpresions.isDigit("a"));
        assertFalse(RegularExpresions.isDigit("a5"));
        assertFalse(RegularExpresions.isDigit("14"));
    }

    @Test
    public void fixedTests() {
        assertFalse(RegularExpresions.isLetter(""));
        assertTrue(RegularExpresions.isLetter("a"));
        assertTrue(RegularExpresions.isLetter("X"));
        assertFalse(RegularExpresions.isLetter("7"));
        assertFalse(RegularExpresions.isLetter("*"));
        assertFalse(RegularExpresions.isLetter("ab"));
        assertFalse(RegularExpresions.isLetter("a\n"));
    }

}
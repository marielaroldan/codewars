import org.junit.Test;

import static org.junit.Assert.*;

public class RowSumOddNumbersTest {
    @Test
    public void rowSumOddNumbers() {
        assertEquals(RowSumOddNumbers.rowSumOddNumbers(1),1);
        assertEquals(8,RowSumOddNumbers.rowSumOddNumbers(2));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));

    }

}
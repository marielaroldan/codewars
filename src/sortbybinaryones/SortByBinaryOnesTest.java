package sortbybinaryones;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortByBinaryOnesTest {
    @Test
    public void sort() throws Exception {
        SortByBinaryOnes sortByBinary = new SortByBinaryOnes();

        assertArrayEquals(SortByBinaryOnes.sort(new Integer[]{1, 3}), new Integer[]{3, 1});
        assertArrayEquals(SortByBinaryOnes.sort(new Integer[]{11,14,21,3,5,80,1}), SortByBinaryOnes.sort(new Integer[]{1,21,80,14,3,5,11}));
        assertArrayEquals(SortByBinaryOnes.sort(new Integer[]{1, 2, 3, 4}), new Integer[]{3, 1, 2, 4});
    }
}
package removeduplicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueArrayTest {

    @Test
    public void test_uniqueArray() throws Exception {

        // "Empty array should return an empty array."
        int[] emptyArray = new int[0];
        assertArrayEquals(new int[0], UniqueArray2.unique(emptyArray));

        // "One value should return that value in array."
        int[] singleValArr = new int[]{-1};
        assertArrayEquals(new int[]{-1}, UniqueArray2.unique(singleValArr));

        // "Multiple values should return in same order as given."
        int[] multipleValsInOrder = new int[]{-1, 5, 10, -100, 3, 2};
        assertArrayEquals(new int[]{-1, 5, 10, -100, 3, 2}, UniqueArray2.unique(multipleValsInOrder));

        // "Duplicates should be removed and in the order first seen." do
        int[] duplicatesInOrder1 = new int[]{1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
        assertArrayEquals(new int[]{1, 2, 3}, UniqueArray2.unique(duplicatesInOrder1));
        int[] duplicatesInOrder2 = new int[]{1, 3, 2, 3, 2, 1, 2, 3, 1, 1, 3, 2};
        assertArrayEquals(new int[]{1, 3, 2}, UniqueArray2.unique(duplicatesInOrder2));
        int[] duplicatesInOrder3 = new int[]{3, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
        assertArrayEquals(new int[]{3, 2, 1}, UniqueArray2.unique(duplicatesInOrder3));

    }
}
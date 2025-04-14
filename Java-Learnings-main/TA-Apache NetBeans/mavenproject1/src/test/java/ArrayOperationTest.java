

import com.mycompany.mavenproject1.ArrayOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayOperationTest {

    @Test
    public void testRemoveDuplicates_basic() {
        int[] input = {1, 2, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, ArrayOperation.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_allUnique() {
        int[] input = {4, 5, 6};
        int[] expected = {4, 5, 6};
        assertArrayEquals(expected, ArrayOperation.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_allDuplicates() {
        int[] input = {7, 7, 7, 7};
        int[] expected = {7};
        assertArrayEquals(expected, ArrayOperation.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_emptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, ArrayOperation.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_unsorted() {
        int[] input = {10, 20, 10, 30, 20};
        int[] expected = {10, 20, 30};
        assertArrayEquals(expected, ArrayOperation.removeDuplicates(input));
    }
}

package io.lenur.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicatesTest {
    @Test
    public void removeDuplicatesFromArrayThatNotHasDuplicateItems() {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int[] unique = ArrayHelper.removeDuplicates(numbers);
        Assertions.assertEquals(6, unique.length);
        Assertions.assertArrayEquals(numbers, unique);
    }

    @Test
    public void removeDuplicates() {
        int[] numbers = {1, 2, 3, 1, 2, 6, 5};

        int[] unique = ArrayHelper.removeDuplicates(numbers);
        Assertions.assertEquals(5, unique.length);
    }
}

package io.lenur.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GetMissingTest {
    @Test
    public void getMissingElementsFromNotMissingArray() {
        int[] numbers = {1, 2, 3};

        int[] missing = ArrayHelper.getMissingElements(numbers);
        Assertions.assertEquals(0, missing.length);
        Assertions.assertArrayEquals(new int[0], missing);
    }

    @Test
    public void getMissingElementsFromMissingArray() {
        int[] numbers = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};

        int[] missing = ArrayHelper.getMissingElements(numbers);
        Assertions.assertEquals(3, missing.length);
        Assertions.assertArrayEquals(new int[]{4, 6, 8}, missing);
    }
}

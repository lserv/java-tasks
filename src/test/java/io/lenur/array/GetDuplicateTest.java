package io.lenur.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetDuplicateTest {
    @Test
    public void getDuplicateOneItemArray() {
        int[] numbers = {1};

        int duplicate = ArrayHelper.findDuplicate(numbers);
        Assertions.assertEquals(-1, duplicate);
    }

    @Test
    public void getDuplicateFromArrayThatHasNoDuplicates() {
        int[] numbers = {1, 2, 3, 4};

        int duplicate = ArrayHelper.findDuplicate(numbers);
        Assertions.assertEquals(-1, duplicate);
    }

    @Test
    public void getDuplicate() {
        int[] numbers = {1, 2, 2, 3, 4};

        int duplicate = ArrayHelper.findDuplicate(numbers);
        Assertions.assertEquals(2, duplicate);
    }
}

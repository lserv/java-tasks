package io.lenur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DuplicateNumberTest {
    private final DuplicateNumber duplicateNumber = new DuplicateNumber();

    @Test
    public void find() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5);
        int duplicate = duplicateNumber.find(numbers);

        Assertions.assertEquals(3, duplicate);
    }
}
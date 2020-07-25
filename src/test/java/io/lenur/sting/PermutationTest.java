package io.lenur.sting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PermutationTest {
    @Test
    public void performNull() {
        List<String> list = Permutation.perform(null);

        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void performOneCharacterString() {
        List<String> list = Permutation.perform("a");

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals("a", list.get(0));
    }

    @Test
    public void performThreeCharacterString() {
        List<String> list = Permutation.perform("abc");
        Assertions.assertEquals(6, list.size());
    }
}
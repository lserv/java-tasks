package io.lenur.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixSumTest {
    @Test
    public void transpose() {
        int[][] from = {{1, 1}, {1, 1}};
        int[][] to = {{1, 2}, {3, 4}};

        int[][] added = MatrixHelper.sum(from, to);

        Assertions.assertEquals(2, added.length);
        Assertions.assertEquals(2, added[0][0]);
        Assertions.assertEquals(3, added[0][1]);
        Assertions.assertEquals(4, added[1][0]);
        Assertions.assertEquals(5, added[1][1]);
    }
}

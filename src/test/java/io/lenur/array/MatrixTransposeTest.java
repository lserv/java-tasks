package io.lenur.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixTransposeTest {
    @Test
    public void transpose() {
        int[][] numbers = {
                {6, 4, 29},
                {1, -9, 8},
        };

        int[][] transposed = MatrixHelper.transpose(numbers);
        Assertions.assertEquals(3, transposed.length);
        Assertions.assertEquals(6, transposed[0][0]);
        Assertions.assertEquals(4, transposed[1][0]);
        Assertions.assertEquals(29, transposed[2][0]);
        Assertions.assertEquals(1, transposed[0][1]);
        Assertions.assertEquals(-9, transposed[1][1]);
        Assertions.assertEquals(8, transposed[2][1]);
    }
}

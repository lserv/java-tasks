package io.lenur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitManipulationTest {
    private final BitManipulation bitManipulation = new BitManipulation();

    @Test
    public void isPowerOfTwoWhenPassPowerTwoThanReturnTrue() {
        boolean result = bitManipulation.isPowerOfTwo(8);

        Assertions.assertTrue(result);
    }

    @Test
    public void isPowerOfTwoWhenPassNotPowerTwoThanReturnTrue() {
        boolean result = bitManipulation.isPowerOfTwo(5);

        Assertions.assertFalse(result);
    }

    @Test
    public void isPowerOfTwoSecondVersionWhenPassPowerTwoThanReturnTrue() {
        boolean result = bitManipulation.isPowerOfTwoSecondVersion(8);

        Assertions.assertTrue(result);
    }

    @Test
    public void isPowerOfTwoSecondVersionWhenPassNotPowerTwoThanReturnTrue() {
        boolean result = bitManipulation.isPowerOfTwoSecondVersion(5);

        Assertions.assertFalse(result);
    }
}
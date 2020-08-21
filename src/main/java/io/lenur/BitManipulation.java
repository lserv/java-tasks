package io.lenur;

public class BitManipulation {
    public boolean isPowerOfTwo(int number) {
        return (number & -number) == number;
    }

    public boolean isPowerOfTwoSecondVersion(int number) {
        return Integer.bitCount(number) == 1;
    }
}

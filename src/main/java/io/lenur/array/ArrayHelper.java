package io.lenur.array;

public class ArrayHelper {
    public static int findDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return numbers[i];
                }
            }
        }

        return -1;
    }
}

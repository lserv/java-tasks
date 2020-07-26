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

    public static int[] removeDuplicates(int[] numbers) {
        int[] uniqueTemp = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueTemp[index++] = numbers[i];
            }
        }
        int[] unique = new int[index];
        System.arraycopy(uniqueTemp, 0, unique, 0, index);

        return unique;
    }

    public static int[] getMissingElements(int[] numbers) {
        int j = 0;
        int length = numbers.length;
        int[] missingTemp = new int[length];
        int index = 0;

        for (int i = numbers[0]; i < numbers[length - 1]; i++) {
            int current = numbers[j];

            if (current == i) {
                while (current == i) {
                    current = numbers[++j];
                }
                continue;
            }

            missingTemp[index++] = i;
        }

        int[] missing = new int[index];
        System.arraycopy(missingTemp, 0, missing, 0, index);

        return missing;
    }
}
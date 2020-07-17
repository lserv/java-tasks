package io.lenur;

import java.util.List;

public class DuplicateNumber {
    public int find(List<Integer> numbers) {
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);

        return total - (highestNumber * (highestNumber + 1) / 2);
    }

    private int getSum(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }
}

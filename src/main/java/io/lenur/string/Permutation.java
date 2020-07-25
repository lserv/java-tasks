package io.lenur.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static List<String> perform(String word) {
        if (word == null) {
            return Collections.emptyList();
        }

        int length = word.length();
        if (length <= 1) {
            return Collections.singletonList(word);
        }

        List<String> permutations = new ArrayList<>();
        permutations.add(String.valueOf(word.charAt(0)));

        for (int i = 1; i < length; i++) {
            for (int j = permutations.size() - 1; j >= 0; j--) {
                String str = permutations.remove(j);
                for (int k = 0; k <= str.length(); k++) {
                    permutations.add(str.substring(0, k) + word.charAt(i) + str.substring(k));
                }
            }
        }

        return permutations;
    }
}

package ch01_array_string;

import java.util.Arrays;
import java.util.stream.Collector;

/**
 * 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
 */
public class Permutation {
    public boolean isPermutation(String str1, String str2) {
        return sort2(str1).equals(sort(str2));
    }

    private String sort(String str) {
        return str.chars()
                .mapToObj(i -> (char) i)
                .sorted()
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }

    private String sort2(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean isPermutation2(String s1, String s2) {
        int[] letters = new int[128];
        for (char c : s1.toCharArray()) {
            letters[c]++;
        }

        for (char c : s2.toCharArray()) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}

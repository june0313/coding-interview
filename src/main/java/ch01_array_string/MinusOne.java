package ch01_array_string;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * 문자열 두 개가 주어졌을 때, 문자열을 같게 만들기 위한 편집 횟수가 1회 이내인지 확인하는 함수를 작성하라.
 */
public class MinusOne {
    public boolean isEditCountWithinOneTime(String s1, String s2) {
        Map<Character, Integer> charFrequencyMap1 = buildCharFrequencyMap(s1);
        Map<Character, Integer> charFrequencyMap2 = buildCharFrequencyMap(s2);
        return diff(charFrequencyMap1, charFrequencyMap2) <= 1 && diff(charFrequencyMap2, charFrequencyMap1) <= 1;
    }

    private Map<Character, Integer> buildCharFrequencyMap(String s1) {
        return s1.chars().mapToObj(i -> (char) i).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
    }

    private int diff(Map<Character, Integer> charFrequencyMap1, Map<Character, Integer> charFrequencyMap2) {
        return charFrequencyMap1.entrySet().stream()
                .map(entry -> entry.getValue() - charFrequencyMap2.getOrDefault(entry.getKey(), 0))
                .mapToInt(i -> i)
                .sum();
    }

}

package ch01_array_string;

import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * 주어진 문자열이 회문(palindrome)의 순열인지 아닌지 확인하는 함수를 작성하라.
 */
public class Palindrome {
    public boolean isPalindromePermutation(String s) {
        final Map<Character, Integer> charFrequencyMap = buildCharFrequencyMapFromString(s);
        final long oddCount = countOddFrequency(charFrequencyMap);
        return oddCount == 0 || oddCount == 1;
    }

    private Map<Character, Integer> buildCharFrequencyMapFromString(String s) {
        return s.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(toMap(c -> c, c -> 1, Integer::sum));
    }

    private long countOddFrequency(Map<Character, Integer> charFrequencyMap) {
        return charFrequencyMap.values().stream().filter(i -> i % 2 == 1).count();
    }
}

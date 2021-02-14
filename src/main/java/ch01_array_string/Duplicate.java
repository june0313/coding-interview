package ch01_array_string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 문자열이 주어젔을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
 */
public class Duplicate {
    public boolean hasDuplicateChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean hasDuplicateChar2(String str) {
        Map<Character, Boolean> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (map.get(c) != null && map.get(c)) {
                return true;
            }

            map.put(c, true);
        }

        return false;
    }

    public boolean hasDuplicateChar3(String str) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (set.contains(c)) {
                return true;
            }

            set.add(c);
        }

        return false;
    }
}

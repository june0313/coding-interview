package ch01_array_string;

/**
 * 문자열에 들어있는 모든 공백을 '%20'으로 바꾸는 메서드를 작성하라.
 */
public class UrlEncoder {
    public String encodeSpace(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public String encodeSpace2(String s) {
        int totalCount = s.length();
        int spaceCount = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        char[] encodedChars = new char[totalCount + (spaceCount * 2)];

        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                encodedChars[index++] = '%';
                encodedChars[index++] = '2';
                encodedChars[index++] = '0';
            } else {
                encodedChars[index++] = c;
            }
        }

        return new String(encodedChars);
    }

    // 별로 좋은 방법은 아닌 것 같다.
    public void encodeSpace3(char[] chars, int trueLength) {
        int spaceCount = 0;
        for (char c : chars) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;

        if (trueLength < chars.length) {
            chars[trueLength] = '\0';
        }

        for (int i = trueLength - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[index - 1] = '0';
                chars[index - 2] = '2';
                chars[index - 3] = '%';
                index = index - 3;
            } else {
                chars[index - 1] = chars[i];
                index = index - 1;
            }
        }
    }
}

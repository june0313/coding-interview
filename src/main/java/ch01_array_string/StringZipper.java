package ch01_array_string;

public class StringZipper {
    public static void main(String[] args) {
        StringZipper stringZipper = new StringZipper();
        System.out.println(stringZipper.zip("aaaabbccaa"));
    }

    public String zip(String s) {
        StringBuilder sb = new StringBuilder();

        char beforeChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (beforeChar == currentChar) {
                count++;
                continue;
            }

            sb.append(beforeChar);
            sb.append(count);

            beforeChar = currentChar;
            count = 1;
        }

        sb.append(beforeChar);
        sb.append(count);

        return s.length() < sb.length() ? s : sb.toString();
    }
}

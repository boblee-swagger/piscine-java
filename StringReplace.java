public class StringReplace {
    public static String replace(String s, String target, String replacement) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + target.length() <= s.length() && s.substring(i, i + target.length()).equals(target)) {
                result.append(replacement);
                i += target.length() - 1; // Adjust index because we've already processed the target
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static String replace(String s, char target, char replacement) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                result.append(replacement);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
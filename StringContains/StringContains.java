public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if (s != null) {
            return s.contains(subString);
        }
        return false;
    }
}
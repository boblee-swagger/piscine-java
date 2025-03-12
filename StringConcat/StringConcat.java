public class StringConcat {
    public static String concatStringBuilder(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        if (s1 != null) {
            sb.append(s1);
        }
        if (s2 != null) {
            sb.append(s2);
        }
        return sb.toString();
    }
}
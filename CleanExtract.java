public class CleanExtract {
    public static String extract(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String[] substrings = s.split("\\|");
        StringBuilder result = new StringBuilder();

        for (String substring : substrings) {
            substring = substring.trim();

            int firstDot = substring.indexOf(".");
            int lastDot = substring.lastIndexOf(".");

            
        }

        return result.toString();
    }

     public static void main(String[] args) {
        System.out.println(CleanExtract.extract("The|. quick brown. | what do you ..| .fox .|. Jumps over the lazy dog. ."));
        System.out.println(CleanExtract.extract("  | Who am .I  | .love coding,  |  |.  Coding is fun . | ...  "));
    }
}


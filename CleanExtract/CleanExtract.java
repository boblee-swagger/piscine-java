public class CleanExtract {
    public static String extract(String s) {

        String[] substrings = s.split("\\|");
        StringBuilder result = new StringBuilder(); 

        for (String sub : substrings) {

            if (sub.startsWith(".") && sub.endsWith(".")) {
                int firstDot = sub.indexOf(".");
                int lastDot = sub.lastIndexOf(".");
                String str = sub.substring(firstDot + 1, lastDot).trim();
                if (!str.isEmpty()) { 
                    result.append(" ").append(str);
                }
            } else if (sub.contains(".")) {
                int index = sub.indexOf(".");
                String str = sub.substring(index + 1).trim();
                if (!str.isEmpty()) { 
                    result.append(" ").append(str);
                }
            }
        }

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '.') {
                result.deleteCharAt(i);
                i--; 
            }
        }

        String output = result.toString().replaceAll("\\s+", " ").trim();

        return output;
    }

    public static void main(String[] args) {
        System.out.println(CleanExtract.extract("The|. quick brown. | what do you ..| .fox .|. Jumps over the lazy dog. ."));
        System.out.println(CleanExtract.extract("  | Who am .I  | .love coding,  |  |.  Coding is fun . | ...  "));
    }
}
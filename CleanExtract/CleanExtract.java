public class CleanExtract {
    public static String extract(String s) {

        String[] substrings = s.split("\\|");
        StringBuilder result = new StringBuilder(substrings[0]);

        for (String sub : substrings) {

            if (sub.startsWith(".") && sub.endsWith(".")){
                 int firstDot = sub.indexOf(".");
                 int lastDot = sub.lastIndexOf(".");
                 String str = sub.substring(firstDot+1, lastDot);
                 result.append(" ").append(str.trim());
            }else if (sub.contains(".")) {
                int index = sub.indexOf(".");
                String str = sub.substring(index+1, sub.length());
                result.append(" ").append(str.trim());
            }
        }


        for (int i = 0; i < result.length()-1; i++){
            if (result.charAt(i) == '.'){
                result.deleteCharAt(i);
            }
        }

        String output = result.toString();
        String[] t = output.split(" ");
        String rs = "";
        for (String str : t){
            str = str.trim();
            rs = rs.concat(str).concat(" ");
        }


        return rs.trim();
    }
}


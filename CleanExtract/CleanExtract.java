public class CleanExtract {
    public static String extract(String s) {

        if (s.length() != 1){
             String[] substrings = s.split("\\|");
            StringBuilder result = new StringBuilder(); 

            for (String sub : substrings) {

                if (sub.startsWith(".") && sub.endsWith(".")) {
                    int firstDot = sub.indexOf(".");
                    int lastDot = sub.lastIndexOf(".");
                    String str = sub.substring(firstDot , lastDot).trim();
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

            for (int i = 0; i < result.length()-1; i++) {
                if (result.charAt(i) == '.') {
                    result.deleteCharAt(i);
                    i--; 
                }
            }

            String output = result.toString().replaceAll("\\s+", " ").trim();
            return output;
                
            }else{
                return "";
            }
    
    }
}
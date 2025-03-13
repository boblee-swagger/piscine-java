import java.io.*;
import java.util.StringTokenizer;

public class Capitalize {
  public static void capitalize(String[] args) throws IOException {
        try ( 
             BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
             
        ) {
            
           String line; 
            while ((line = reader.readLine()) != null) {
                String capitalizedLine = capitalizeWords(line);
                writer.write(capitalizedLine);
                writer.newLine();
            }
        }
    }

     private static String capitalizeWords(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);
        StringBuilder capitalized = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase()).append(" ");
            }
        }

        return capitalized.toString().trim();
    }
}
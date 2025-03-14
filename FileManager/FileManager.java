import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        }

    }

    public static String getContentFile(String fileName) throws IOException {
        StringBuilder fullString = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fullString.append(line).append("\n");
            }
            return fullString.toString();
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
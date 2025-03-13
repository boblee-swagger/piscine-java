//import java.io.ByteArrayOutputStream;
import java.io.IOException;
//import java.io.PrintStream;
import java.io.FileInputStream;

public class Cat {
    //read content of a file an print it to stdout
    public static void cat(String[] args) throws IOException {
        //because the exercise says that you have to read the content of "a" file
        if (args.length == 1){
            try (FileInputStream fileInput = new FileInputStream(args[0])) {
                // Use a buffer for efficient reading
                byte[] buffer = new byte[4096]; // 4KB buffer size is a reasonable choice
                int bytesRead;
                
                // Read from file and write to stdout until end of file
                while ((bytesRead = fileInput.read(buffer)) != -1) {
                    System.out.write(buffer, 0, bytesRead);
                }
                // Flush to ensure all data is written
                System.out.flush();
            }   
        }
    }

    public static void main(String[] args) throws IOException {
        // PrintStream stdout = System.out;

        // ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // PrintStream printStream = new PrintStream(outputStream);
        // System.setOut(printStream);

        // cat(new String[]{"input.txt"});
        // String output = outputStream.toString();
        // // Reset out to stdout
        // System.setOut(stdout);
        // System.out.println(output.equals("test input file\n"));

        // ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        // PrintStream printStream2 = new PrintStream(outputStream2);
        // System.setOut(printStream2);

        // cat(new String[]{});
        // String output2 = outputStream2.toString();
        // // Reset out to stdout
        // System.setOut(stdout);
        // System.out.println(output2.equals(""));
    }
}

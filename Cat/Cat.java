import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cat {
    //read content of a file an print it to stdout
    public static void cat(String[] args) throws IOException {
        //because the exercise says that you have to read the content of "a" file
        if (args.length == 1) {
            try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
            

                while(line != null){
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                System.out.println(sb.toString());
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

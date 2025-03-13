import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.io.ByteArrayInputStream;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 1){
            try(
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter(args[0]);
            ){
                String Input = bf.readLine();
                fw.write(Input); 
                
            }
        }
    }

    // public static void main(String[] args) throws IOException {
    //     String input = "input file test\n";
    //     ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    //     System.setIn(in);
    //     CatInFile.cat(new String[]{"output"});
    //     String fileContent = new String(Files.readAllBytes(Paths.get("output")));
    //     System.out.println(fileContent.equals(input));
    // }
}
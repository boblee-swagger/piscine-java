import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.io.ByteArrayInputStream;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 1){
            String fileName = args[0];
            try(
                InputStream streamIn = System.in;
                OutputStream out = new FileOutputStream(fileName);
            ){
                
                byte[] buf = new byte[4096];
                int byteRead;

                while((byteRead = streamIn.read(buf)) != -1){
                    out.write(buf, 0, byteRead);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
    //     String input = "input file test\n";
    //     ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    //     System.setIn(in);
    //     CatInFile.cat(new String[]{"output"});
    //     String fileContent = new String(Files.readAllBytes(Paths.get("output")));
    //     System.out.println(fileContent.equals(input));
    }
}
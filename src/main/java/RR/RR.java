import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class RR{
    public static void main(String[] args) throws IOException {
        Files.copy(new File(args[0]).toPath(), System.out);
    }
}

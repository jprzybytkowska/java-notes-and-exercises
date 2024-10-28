package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFiles {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("New text");
        writer.close();
    }
}

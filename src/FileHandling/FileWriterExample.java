package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\admin\\Documents\\Rutuja corporate\\rutuja.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Hello Everyone....Good Evening..How Are You?");
        fw.close();

    }

}

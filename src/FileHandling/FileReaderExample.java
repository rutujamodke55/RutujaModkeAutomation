package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[]args) throws IOException {
        File f = new File("C:\\Users\\admin\\Documents\\Rutuja corporate\\rutuja.txt");
        FileReader fr = new FileReader(f);

        int x;
        while((x= fr.read())!= -1){
            System.out.print((char)x);

        }
    }
}

package FileHandling;

import java.io.File;
import java.io.IOException;

public class fileExample {
    public static void main(String[]args) throws IOException {
        File f = new File("C:\\Users\\admin\\Documents\\Rutuja corporate\\rutuja.txt");
        f.createNewFile();

        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isAbsolute());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isFile());
        System.out.println(f.getParent());
        System.out.println(f.toPath());
        System.out.println(f.toURI());
    }
}

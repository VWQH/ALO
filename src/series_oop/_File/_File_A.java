package series_oop._File;

import java.io.File;

public class _File_A {
    public static void main(String[] args) {
        File file = new File("C:/Users/OS/Desktop/1.txt");

        if(file.exists()){
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        }else{
            System.out.println("That file doesn't exists");
        }
    }
}

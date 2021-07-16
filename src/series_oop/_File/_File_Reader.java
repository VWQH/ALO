package series_oop._File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _File_Reader {

    // https://viettuts.vn/java-io/lop-filereader-trong-java

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:/Users/OS/Desktop/1.txt");
            int data = reader.read();
            while (data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

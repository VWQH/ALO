package series_oop._File;

import java.io.FileWriter;

public class _File_Writer {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:/Users/OS/Desktop/1.txt");
            writer.write("Rose are red \nViolets are blue\n");
            writer.append("(OK)");
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

package com_hqh.buffer;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        /*String s = "ABC";
        String arr[] = {"A", "B", "C"};
        FileWriter fw = new FileWriter("da.txt" ); // (fileName, append: true or false)
        BufferedWriter bw = new BufferedWriter(fw);
        // bw.write(s);
        for (String s1: arr) {
            bw.write(s1);
            bw.newLine();
        }
        bw.close();
        fw.close();
        */


        FileReader fr = new FileReader("da.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }


    }
}

package com_hqh.lamda_interface;

public class Main {


    public static void print(String str, StringFuntion format){
        String rs = format.run(str);
        System.out.println(rs);
    }

    public static void main(String[] args) {
        StringFuntion ex = (str -> str + "!");
        print("Hi", ex);
    }
}

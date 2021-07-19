package com_hqh.lamda;

public class StringBuilder {
    public static void main(String[] args) {

        StringBuffer s =new StringBuffer("GeeksforGeeks");
        System.out.println(s.length() + " " + s.capacity());
        s.append("HQ");
        System.out.println(s);
        System.out.println(s.reverse()); // đảo chuỗi
        s.insert(5, "FOR");
        System.out.println(s);
        System.out.println(s.delete(0,5));
        System.out.println(s.deleteCharAt(0));
    }

}
